package cz.koscak.jan.game.epidemic;

import cz.koscak.jan.game.epidemic.model.*;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Human> listOfHumans = new ArrayList<>();
    private List<Place> listOfPlaces = new ArrayList<>();

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
        for (int i = 0; i < 6; i++) {
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
        }


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
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + i * 21, 28 + 5 + j * 21,
                        PlaceType.SHOP, Area.QUADRANT_TOP_LEFT));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + 200 + i * 21, 28 + 5 + j * 21,
                        PlaceType.SPORT, Area.QUADRANT_TOP_LEFT));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + i * 21, 28 + 5 + 200 + j * 21,
                        PlaceType.WORK, Area.QUADRANT_TOP_LEFT));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + 200 + i * 21, 28 + 5 + 200 + j * 21,
                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
            }
        }

        // LOWER RIGHT - Quadrant Bottom Right
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

    }

    void play() {
        if (GameStatus.PAUSED.equals(gameStatus)) {
            return;
        }
        time = time + 1;
        for (Human human: listOfHumans) {
            if (human.getX() <= 785) {
                human.setX(human.getX() + 1);
            }
            human.setY(human.getY() + 0);
        }
        // TODO: Play
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

    public long getTime() {
        return time;
    }

}
