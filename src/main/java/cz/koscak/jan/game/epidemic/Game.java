package cz.koscak.jan.game.epidemic;

import cz.koscak.jan.game.epidemic.model.Human;
import cz.koscak.jan.game.epidemic.model.HumanState;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Human> listOfHumans = new ArrayList<>();

    //private GameStatus gameStatus = GameStatus.PLAY;
    private GameStatus gameStatus = GameStatus.PAUSED;

    void newGame() {
        listOfHumans.add(new Human(300, 300));
        listOfHumans.get(0).setState(HumanState.INFECTED);
        listOfHumans.add(new Human(300, 325));
        listOfHumans.get(1).setState(HumanState.SICK);
        listOfHumans.add(new Human(300, 350));
        listOfHumans.get(2).setState(HumanState.IMMUNE);
        listOfHumans.add(new Human(300, 375));
        listOfHumans.get(3).setState(HumanState.DEAD);
        // TODO: Setup

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(500 + i * 16, 28 + j * 16));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(693 + i * 18, 28 + j * 18));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(500 + i * 18, 28 + 193 + j * 18));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfHumans.add(new Human(693 + i * 18, 28 + 193 + j * 18));
            }
        }
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

    public void paint(Graphics g) {
        /*for (Human human: listOfHumans) {
            human.paint(g);

        }*/
        // TODO: On all objects: paint()
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

}
