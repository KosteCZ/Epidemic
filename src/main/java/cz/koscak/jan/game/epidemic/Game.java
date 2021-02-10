package cz.koscak.jan.game.epidemic;

import cz.koscak.jan.game.epidemic.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Game {

    private List<Human> listOfHumans = new ArrayList<>();
    private List<Place> listOfPlaces = new ArrayList<>();
    private List<Virus> listOfViruses = new ArrayList<>();

    //private GameStatus gameStatus = GameStatus.PLAY;
    private GameStatus gameStatus = GameStatus.PAUSED;

    private long time = 0;

    void newGame() {
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

        // Places
        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + i * 21, 28 + 5 + j * 21,
                        PlaceType.SHOP, Area.QUADRANT_TOP_LEFT));
            }
        }*/
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 1));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 4));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 5));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 20));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 2));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 13));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 8));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 15));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 23));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 26));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 24));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 14));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 16));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 19));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 3));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 6));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 21));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 9));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 27));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 28));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 12));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 18));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 29));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 30));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 7));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 11));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 22));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 10));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 31));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 32));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 17));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 25));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 33));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 34));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 35));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 36));

        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + 200 + i * 21, 28 + 5 + j * 21,
                        PlaceType.SPORT, Area.QUADRANT_TOP_LEFT));
            }
        }*/
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 1));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 3));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 4));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 5));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 14));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 15));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 2));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 13));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 19));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 20));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 26));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 27));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 6));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 7));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 11));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 12));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 8));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 9));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 23));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 24));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 28));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 29));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 30));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 31));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 16));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 10));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 32));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 33));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 18));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 21));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 17));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 25));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 34));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 35));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 36));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 22));

        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + i * 21, 28 + 5 + 200 + j * 21,
                        PlaceType.WORK, Area.QUADRANT_TOP_LEFT));
            }
        }*/
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 1));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 4));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 5));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 20));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 2));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 13));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 8));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 15));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 23));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 26));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 24));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 14));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 16));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 19));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 3));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 6));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 21));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 9));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 12));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 18));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 27));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 28));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 29));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 30));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 7));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 11));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 22));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 10));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 25));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 31));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 17));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 32));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 33));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 34));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 35));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 36));

        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + 200 + i * 21, 28 + 5 + 200 + j * 21,
                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
            }
        }*/
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 1));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 26));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 4));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 5));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 27));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 8));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 2));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 3));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 6));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 7));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 9));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 10));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 11));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 28));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 30));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 31));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 33));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 14));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 29));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 12));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 13));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 32));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 15));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 34));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 16));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 35));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 19));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 20));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 36));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 23));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 17));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 18));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 21));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 22));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 24));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 25));

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

    void play() {
        if (GameStatus.PAUSED.equals(gameStatus)) {
            return;
        }
        time = time + 1;
        /*for (Human human: listOfHumans) {
            if (human.getX() <= 785) {
                human.setX(human.getX() + 1);
            }
            human.setY(human.getY() + 0);
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

 /*   public void paint(Graphics g) {
//        for (Human human: listOfHumans) {
////            human.paint(g);
////        }
        // TODO: On all objects: paint()
    }*/

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
