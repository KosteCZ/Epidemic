package cz.koscak.jan.game.epidemic.model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Game {

    private static final int GAME_SPEED_DELAY_DEFAULT = 80;
    private static final List<Area> LIST_OF_QUADRANTS = List.of(Area.QUADRANT_TOP_LEFT, Area.QUADRANT_TOP_RIGHT,
            Area.QUADRANT_BOTTOM_RIGHT, Area.QUADRANT_BOTTOM_LEFT);

    private List<Human> listOfHumans = new ArrayList<>();
    private List<Place> listOfPlaces = new ArrayList<>();
    private List<Virus> listOfViruses = new ArrayList<>();

    private boolean debugMode = false;

    private GameStatus gameStatus = GameStatus.PAUSED;

    private long time = 0;
    private int speed = 2;

    public void newGame() {
        //setDebugMode(true);
        setDebugMode(false);

        time = 0;

        listOfHumans = new ArrayList<>();
        listOfPlaces = new ArrayList<>();
        listOfViruses = new ArrayList<>();

        if (!(GameStatus.PLAY.equals(gameStatus) || GameStatus.PAUSED.equals(gameStatus))) {
            gameStatus = GameStatus.PAUSED;
        }

        if (isDebugMode()) {
            listOfHumans.add(new Human(370, 300));
            listOfHumans.get(0).setState(HumanState.INFECTED);
            listOfHumans.add(new Human(370, 325));
            listOfHumans.get(1).setState(HumanState.SICK);
            listOfHumans.add(new Human(370, 350));
            listOfHumans.get(2).setState(HumanState.IMMUNE);
            listOfHumans.add(new Human(370, 375));
            listOfHumans.get(3).setState(HumanState.DEAD);
        }

        GameSetup.addHumans(listOfHumans);
        GameSetup.addPlaces(listOfPlaces);

        Human humanToBeInfectedTopLeft = findHuman(Area.QUADRANT_TOP_LEFT, 13);
        humanToBeInfectedTopLeft.setState(HumanState.INFECTED);

        Human humanToBeInfectedTopRight = findHuman(Area.QUADRANT_TOP_RIGHT, 13);
        humanToBeInfectedTopRight.setState(HumanState.INFECTED);

        Human humanToBeInfectedBottomLeft = findHuman(Area.QUADRANT_BOTTOM_LEFT, 13);
        humanToBeInfectedBottomLeft.setState(HumanState.INFECTED);

        Human humanToBeInfectedBottomRight = findHuman(Area.QUADRANT_BOTTOM_RIGHT, 13);
        humanToBeInfectedBottomRight.setState(HumanState.INFECTED);
    }

    public void play() {
        if (!GameStatus.PLAY.equals(gameStatus)) {
            return;
        }
        time = time + 1;

        for (Human human: listOfHumans) {
            human.doAction(this, time, listOfViruses);
        }
        ListIterator<Virus> iteratorVirus = listOfViruses.listIterator();
        while(iteratorVirus.hasNext()){
            if(iteratorVirus.next().doAction(listOfHumans) == false){
                iteratorVirus.remove();
            }
        }

        checkVictoryCondition();
    }

    private void checkVictoryCondition() {
        for (Human human: listOfHumans) {
            if (!HumanState.HEALTHY.equals(human.getState())) return;
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
}
