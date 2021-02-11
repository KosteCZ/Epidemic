package cz.koscak.jan.game.epidemic.model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Game {

    private List<Human> listOfHumans = new ArrayList<>();
    private List<Place> listOfPlaces = new ArrayList<>();
    private List<Virus> listOfViruses = new ArrayList<>();

    private GameStatus gameStatus = GameStatus.PAUSED;

    private long time = 0;

    public void newGame() {
        time = 0;
        listOfHumans.add(new Human(370, 300));
        listOfHumans.get(0).setState(HumanState.INFECTED);
        listOfHumans.add(new Human(370, 325));
        listOfHumans.get(1).setState(HumanState.SICK);
        listOfHumans.add(new Human(370, 350));
        listOfHumans.get(2).setState(HumanState.IMMUNE);
        listOfHumans.add(new Human(370, 375));
        listOfHumans.get(3).setState(HumanState.DEAD);

        GameSetup.addHumans(listOfHumans);
        GameSetup.addPlaces(listOfPlaces);
    }

    public void play() {
        if (GameStatus.PAUSED.equals(gameStatus)) {
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
    }

    public Place findPlace(Area area, PlaceType placeType, int position) {
        for (Place place: listOfPlaces) {
            if (place.getPosition() == position && area.equals(place.getArea()) && placeType.equals(place.getType())) {
                return place;
            }
        }
        return null;
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

}
