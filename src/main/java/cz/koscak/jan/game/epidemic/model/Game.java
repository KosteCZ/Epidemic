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
        // TODO: Setup

        // UPPER LEFT
        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(6 + i * 21, 0 + 28 + 6 + j * 21));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(6 + i * 21, 200 + 28 + 6 + j * 21));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(200 + 6 + i * 21, 0 + 28 + 6 + j * 21));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(200 + 6 + i * 21, 200 + 28 + 6 + j * 21));
            }
        }*/
        listOfHumans.add(new Human(201 + 6 + 0 * 21, 202 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 1));
        listOfHumans.add(new Human(201 + 1 + 1 * 21, 202 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 26));
        listOfHumans.add(new Human(201 + 7 + 2 * 21, 202 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 4));
        listOfHumans.add(new Human(201 + 2 + 3 * 21, 202 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 5));
        listOfHumans.add(new Human(201 + 9 + 4 * 21, 202 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 27));
        listOfHumans.add(new Human(201 + 4 + 5 * 21, 202 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 8));

        listOfHumans.add(new Human(201 + 6 + 0 * 21, 218 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 2));
        listOfHumans.add(new Human(201 + 1 + 1 * 21, 218 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 3));
        listOfHumans.add(new Human(201 + 7 + 2 * 21, 218 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 6));
        listOfHumans.add(new Human(201 + 2 + 3 * 21, 218 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 7));
        listOfHumans.add(new Human(201 + 9 + 4 * 21, 218 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 9));
        listOfHumans.add(new Human(201 + 4 + 5 * 21, 218 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 10));

        listOfHumans.add(new Human(201 + 6 + 0 * 21, 247 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 11));
        listOfHumans.add(new Human(201 + 1 + 1 * 21, 247 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 28));
        listOfHumans.add(new Human(201 + 7 + 2 * 21, 247 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 30));
        listOfHumans.add(new Human(201 + 2 + 3 * 21, 247 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 31));
        listOfHumans.add(new Human(201 + 9 + 4 * 21, 247 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 33));
        listOfHumans.add(new Human(201 + 4 + 5 * 21, 247 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 14));

        listOfHumans.add(new Human(201 + 6 + 0 * 21, 263 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 29));
        listOfHumans.add(new Human(201 + 1 + 1 * 21, 263 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 12));
        listOfHumans.add(new Human(201 + 7 + 2 * 21, 263 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 13));
        listOfHumans.add(new Human(201 + 2 + 3 * 21, 263 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 32));
        listOfHumans.add(new Human(201 + 9 + 4 * 21, 263 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 15));
        listOfHumans.add(new Human(201 + 4 + 5 * 21, 263 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 34));

        listOfHumans.add(new Human(201 + 6 + 0 * 21, 291 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 16));
        listOfHumans.add(new Human(201 + 1 + 1 * 21, 291 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 35));
        listOfHumans.add(new Human(201 + 7 + 2 * 21, 291 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 19));
        listOfHumans.add(new Human(201 + 2 + 3 * 21, 291 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 20));
        listOfHumans.add(new Human(201 + 9 + 4 * 21, 291 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 36));
        listOfHumans.add(new Human(201 + 4 + 5 * 21, 291 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 23));

        listOfHumans.add(new Human(201 + 6 + 0 * 21, 306 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 17));
        listOfHumans.add(new Human(201 + 1 + 1 * 21, 306 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 18));
        listOfHumans.add(new Human(201 + 7 + 2 * 21, 306 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 21));
        listOfHumans.add(new Human(201 + 2 + 3 * 21, 306 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 22));
        listOfHumans.add(new Human(201 + 9 + 4 * 21, 306 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 24));
        listOfHumans.add(new Human(201 + 4 + 5 * 21, 306 + 28 + 6 + 0 * 21, Area.QUADRANT_TOP_LEFT, 25));


        // UPPER RIGHT
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(500 + 0 + i * 17, 28 + 1 + j * 17));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(693 + 8 + i * 17, 28 + 1 + j * 17));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(500 + 0 + i * 17, 28 + 8 + 193 + j * 17));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(693 + 8 + i * 17, 28 + 8 + 193 + j * 17));
            }
        }

        // LOWER LEFT
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(6 + i * 21, 470 + 28 + 6 + j * 21));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(6 + i * 21, 675 + 28 + 1 + j * 21));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(200 + 6 + i * 21, 470 + 28 + 6 + j * 21));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(200 + 6 + i * 21, 670 + 28 + 6 + j * 21));
            }
        }

        // LOWER RIGHT
//        listOfHumans.add(new Human(470 + 6,       470 + 28 + 9 ));
//        listOfHumans.add(new Human(470 + 22,      470 + 28 + 9 ));
        listOfHumans.add(new Human(470 + 14,      470 + 28 + 9 ));
        listOfHumans.add(new Human(470 + 6,       470 + 28 + 23));
        listOfHumans.add(new Human(470 + 22,      470 + 28 + 23));

        listOfHumans.add(new Human(470 + 6  + 43, 470 + 28 + 9 ));
        listOfHumans.add(new Human(470 + 22 + 43, 470 + 28 + 9 ));
        listOfHumans.add(new Human(470 + 6  + 43, 470 + 28 + 23));
        listOfHumans.add(new Human(470 + 22 + 43, 470 + 28 + 23));

//        listOfHumans.add(new Human(470 + 6  + 87, 470 + 28 + 9 ));
//        listOfHumans.add(new Human(470 + 22 + 87, 470 + 28 + 9 ));
        listOfHumans.add(new Human(470 + 14 + 87, 470 + 28 + 9 ));
        listOfHumans.add(new Human(470 + 6  + 87, 470 + 28 + 23));
        listOfHumans.add(new Human(470 + 22 + 87, 470 + 28 + 23));


        listOfHumans.add(new Human(470 + 6,       470 + 28 + 10 + 44));
        listOfHumans.add(new Human(470 + 22,      470 + 28 + 23 + 44));

//        listOfHumans.add(new Human(470 + 6  + 43, 470 + 28 + 9  + 44));
//        listOfHumans.add(new Human(470 + 22 + 43, 470 + 28 + 23 + 44));
        listOfHumans.add(new Human(470 + 15 + 43, 470 + 28 + 16 + 44));

        listOfHumans.add(new Human(470 + 6  + 87, 470 + 28 + 10 + 44));
        listOfHumans.add(new Human(470 + 22 + 87, 470 + 28 + 23 + 44));


//        listOfHumans.add(new Human(470 + 6,       470 + 28 + 9  + 88));
//        listOfHumans.add(new Human(470 + 22,      470 + 28 + 9  + 88));
        listOfHumans.add(new Human(470 + 14,      470 + 28 + 9  + 88));
        listOfHumans.add(new Human(470 + 6,       470 + 28 + 23 + 88));
        listOfHumans.add(new Human(470 + 22,      470 + 28 + 23 + 88));

        listOfHumans.add(new Human(470 + 6  + 43, 470 + 28 + 9  + 88));
        listOfHumans.add(new Human(470 + 22 + 43, 470 + 28 + 9  + 88));
        listOfHumans.add(new Human(470 + 6  + 43, 470 + 28 + 23 + 88));
        listOfHumans.add(new Human(470 + 22 + 43, 470 + 28 + 23 + 88));

//        listOfHumans.add(new Human(470 + 6  + 87, 470 + 28 + 9  + 88));
//        listOfHumans.add(new Human(470 + 22 + 87, 470 + 28 + 9  + 88));
        listOfHumans.add(new Human(470 + 14  + 87, 470 + 28 + 9  + 88));
        listOfHumans.add(new Human(470 + 6  + 87, 470 + 28 + 23 + 88));
        listOfHumans.add(new Human(470 + 22 + 87, 470 + 28 + 23 + 88));


        // ###################### PLACES ############################
        GameSetup.addPlaces(listOfPlaces);

        // LOWER RIGHT - Quadrant Bottom Right
/*
//        listOfPlaces.add(new Place(470 + 6,       470 + 28 + 9 ,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
//        listOfPlaces.add(new Place(470 + 22,      470 + 28 + 9 ,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 14,      470 + 28 + 9 ,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 6,       470 + 28 + 23,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22,      470 + 28 + 23,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));

        listOfPlaces.add(new Place(470 + 6  + 43, 470 + 28 + 9 ,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22 + 43, 470 + 28 + 9 ,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 6  + 43, 470 + 28 + 23,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22 + 43, 470 + 28 + 23,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));

//        listOfPlaces.add(new Place(470 + 6  + 87, 470 + 28 + 9 ,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
//        listOfPlaces.add(new Place(470 + 22 + 87, 470 + 28 + 9 ,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 14 + 87, 470 + 28 + 9 ,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 6  + 87, 470 + 28 + 23,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22 + 87, 470 + 28 + 23,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));


        listOfPlaces.add(new Place(470 + 6,       470 + 28 + 10 + 44,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22,      470 + 28 + 23 + 44,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));

//        llistOfPlaces.add(new Place(470 + 6  + 43, 470 + 28 + 9  + 44,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
//        listOfPlaces.add(new Place(470 + 22 + 43, 470 + 28 + 23 + 44,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 15 + 43, 470 + 28 + 16 + 44,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));

        listOfPlaces.add(new Place(470 + 6  + 87, 470 + 28 + 10 + 44,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22 + 87, 470 + 28 + 23 + 44,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));


//        listOfPlaces.add(new Place(470 + 6,       470 + 28 + 9  + 88,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
//        listOfPlaces.add(new Place(470 + 22,      470 + 28 + 9  + 88,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 14,      470 + 28 + 9  + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 6,       470 + 28 + 23 + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22,      470 + 28 + 23 + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));

        listOfPlaces.add(new Place(470 + 6  + 43, 470 + 28 + 9  + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22 + 43, 470 + 28 + 9  + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 6  + 43, 470 + 28 + 23 + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22 + 43, 470 + 28 + 23 + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));

//        listOfPlaces.add(new Place(470 + 6  + 87, 470 + 28 + 9  + 88,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
//        listOfPlaces.add(new Place(470 + 22 + 87, 470 + 28 + 9  + 88,
//                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 14  + 87, 470 + 28 + 9  + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 6  + 87, 470 + 28 + 23 + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
        listOfPlaces.add(new Place(470 + 22 + 87, 470 + 28 + 23 + 88,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
*/
    }

    public void play() {
        if (GameStatus.PAUSED.equals(gameStatus)) {
            return;
        }
        time = time + 1;
        /*for (Human human: listOfHumans) {
            if (human.getXForHuman() <= 785) {
                human.setX(human.getXForHuman() + 1);
            }
            human.setY(human.getYForHuman() + 0);
        }*/


        // TODO: Play
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
