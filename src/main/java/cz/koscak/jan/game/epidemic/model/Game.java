package cz.koscak.jan.game.epidemic.model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Game {

    private static final int GAME_SPEED_DELAY_DEFAULT = 80;
    private static final List<Area> LIST_OF_QUADRANTS = List.of(Area.QUADRANT_TOP_LEFT, Area.QUADRANT_TOP_RIGHT,
            Area.QUADRANT_BOTTOM_RIGHT, Area.QUADRANT_BOTTOM_LEFT);

    private List<Human> listOfHumans = new ArrayList<>();
    private List<Place> listOfPlaces = new ArrayList<>();
    private List<Virus> listOfViruses = new ArrayList<>();
    private List<Place> listOfProtestPlaces = new ArrayList<>();

    private boolean debugMode = false;

    private GameStatus gameStatus = GameStatus.PAUSED;

    private long time = 0;
    private int speed = 2;
    private int allHumansCount = 100;
    private int healthyOrImmune = 0;
    private int infectedOrSick = 0;
    private int dead = 0;
    private int pes = 0; // Epidemic level 0-5

    public void newGame() {
        //setDebugMode(true);
        setDebugMode(false);

        time = 0;
        allHumansCount = 100;
        healthyOrImmune = 100;
        infectedOrSick = 0;
        pes = 0;

        listOfHumans = new ArrayList<>();
        listOfPlaces = new ArrayList<>();
        listOfViruses = new ArrayList<>();
        listOfProtestPlaces = new ArrayList<>();

        if (!(GameStatus.PLAY.equals(gameStatus) || GameStatus.PAUSED.equals(gameStatus))) {
            gameStatus = GameStatus.PAUSED;
        }

        GameSetup.addHumans(listOfHumans);
        GameSetup.addPlaces(listOfPlaces);

        List<Place> temporaryListOfProtestPlaces = new ArrayList<>();
        for (Place place: listOfPlaces) {
            if (PlaceType.PROTEST_PLACE.equals(place.getType())) {
                temporaryListOfProtestPlaces.add(place);
            }
        }
        for (int i = 0; i < 36; i++) {
            for (Place place: temporaryListOfProtestPlaces) {
                if (place.getPosition() == i) {
                    listOfProtestPlaces.add(place);
                    break;
                }
            }
        }

        Human humanToBeInfectedTopLeft = findHuman(Area.QUADRANT_TOP_LEFT, 13);
        humanToBeInfectedTopLeft.setState(HumanState.INFECTED);

        Human humanToBeInfectedTopRight = findHuman(Area.QUADRANT_TOP_RIGHT, 13);
        humanToBeInfectedTopRight.setState(HumanState.INFECTED);

        Human humanToBeInfectedBottomLeft = findHuman(Area.QUADRANT_BOTTOM_LEFT, 13);
        humanToBeInfectedBottomLeft.setState(HumanState.INFECTED);

        Human humanToBeInfectedBottomRight = findHuman(Area.QUADRANT_BOTTOM_RIGHT, 13);
        humanToBeInfectedBottomRight.setState(HumanState.INFECTED);

        updateInfectedOrSickCountAndUpdatePes();
    }

    public void play() {
        if (!GameStatus.PLAY.equals(gameStatus)) {
            return;
        }
        time = time + 1;

        for (Human human: listOfHumans) {
            human.doAction(this, time, listOfViruses);
        }

        spreadVirusAndRemoveOld();

        virusKills();

        updateInfectedOrSickCountAndUpdatePes();

        checkVictoryCondition();
    }

    private void virusKills() {
        if (infectedOrSick - healthyOrImmune > 0) {
            Random random = new Random();
            int randomNumber = random.nextInt(20);
            if (debugMode) System.out.println("DEATH - random number: " + randomNumber);
            if (randomNumber == 0) {
                if (debugMode) System.out.println("DEATH - dying, because of number: " + randomNumber);
                for (Human human: listOfHumans) {
                    if (HumanState.SICK.equals(human.getState())) {
                        human.setState(HumanState.DEAD);
                        return;
                    }
                }
            }
        }
    }

    private void spreadVirusAndRemoveOld() {
        ListIterator<Virus> iteratorVirus = listOfViruses.listIterator();
        while(iteratorVirus.hasNext()){
            if(iteratorVirus.next().doAction(listOfHumans) == false){
                iteratorVirus.remove();
            }
        }
    }

    private void updateInfectedOrSickCountAndUpdatePes() {
        int currentlyHealthyOrImmune = 0;
        int currentlyInfectedOrSick = 0;
        int currentDead = 0;
        for (Human human: listOfHumans) {
            if (HumanState.INFECTED.equals(human.getState()) || HumanState.SICK.equals(human.getState())) {
                currentlyInfectedOrSick = currentlyInfectedOrSick + 1;
            } else if (HumanState.HEALTHY.equals(human.getState()) || HumanState.IMMUNE.equals(human.getState())) {
                currentlyHealthyOrImmune = currentlyHealthyOrImmune + 1;
            } else if (HumanState.DEAD.equals(human.getState())) {
                currentDead = currentDead + 1;
            }

        }
        healthyOrImmune = currentlyHealthyOrImmune;
        infectedOrSick = currentlyInfectedOrSick;
        dead = currentDead;
        if (infectedOrSick < 10) {
            pes = 0;
        } else if (infectedOrSick < 20) {
            pes = 1;
        } else if (infectedOrSick < 30) {
            pes = 2;
        } else if (infectedOrSick < 40) {
            pes = 3;
        } else if (infectedOrSick < 50) {
            pes = 4;
        } else {
            pes = 5;
        }
    }

    private void checkVictoryCondition() {
        if (dead >= 10) {
            gameStatus = GameStatus.DEFEAT;
            return;
        }
        for (Human human: listOfHumans) {
            if (!(HumanState.HEALTHY.equals(human.getState()) || HumanState.DEAD.equals(human.getState()))) return;
        }
        gameStatus = GameStatus.VICTORY;
    }

    public Place findPlace(Area area, PlaceType placeType, int position) {
        for (Place place: listOfPlaces) {
            if (place.getPosition() == position && area.equals(place.getArea()) && placeType.equals(place.getType())) {
                return place;
            }
        }
        return null;
    }

    public Human findHuman(Area area, int position) {
        for (Human human: listOfHumans) {
            if (human.getPosition() == position && area.equals(human.getArea())) {
                return human;
            }
        }
        return null;
    }

    public int getSpeedDelay() {
        return GAME_SPEED_DELAY_DEFAULT / ((int) Math.pow(2, speed));
    }

    public String getSpeedForUI() {
        if (speed > 1) return "  " + (speed - 1);
        return "0.5";
    }

    public Area getAreaForNumber(int number) {
        return LIST_OF_QUADRANTS.get((number + 4) % 4);
    }

    public int getNumberOfArea(Area area) {
        return LIST_OF_QUADRANTS.indexOf(area);
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public List<Human> getListOfHumans() {
        return listOfHumans;
    }

    public List<Place> getListOfPlaces() {
        return listOfPlaces;
    }

    public List<Virus> getListOfViruses() {
        return listOfViruses;
    }

    public long getTime() {
        return time;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getInfectedOrSick() {
        return infectedOrSick;
    }

    /*public int getHealthyOrImmune() {
        return healthyOrImmune;
    }*/

    public int getAllHumansCount() {
        return allHumansCount;
    }

    public int getDead() {
        return dead;
    }

    public int getPes() {
        return pes;
    }

    public List<Place> getListOfProtestPlaces() {
        return listOfProtestPlaces;
    }
}
