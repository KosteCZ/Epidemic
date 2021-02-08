package cz.koscak.jan.game.epidemic;

import cz.koscak.jan.game.epidemic.model.Human;
import cz.koscak.jan.game.epidemic.model.HumanState;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Human> listOfHumans = new ArrayList<>();

    //private GameStatus gameStatus = GameStatus.PLAY;
    private GameStatus gameStatus = GameStatus.PAUSED;

    void newGame() {
        listOfHumans.add(new Human(370, 300));
        listOfHumans.get(0).setState(HumanState.INFECTED);
        listOfHumans.add(new Human(370, 325));
        listOfHumans.get(1).setState(HumanState.SICK);
        listOfHumans.add(new Human(370, 350));
        listOfHumans.get(2).setState(HumanState.IMMUNE);
        listOfHumans.add(new Human(370, 375));
        listOfHumans.get(3).setState(HumanState.DEAD);
        // TODO: Setup

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
    }

    void play() {
        if (GameStatus.PAUSED.equals(gameStatus)) {
            return;
        }
        for (Human human: listOfHumans) {
            if (human.getX() <= 710) {
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

}
