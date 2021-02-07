package cz.koscak.jan.game.epidemic;

import cz.koscak.jan.game.epidemic.model.Human;
import cz.koscak.jan.game.epidemic.model.HumanState;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Human> listOfHumans = new ArrayList<>();

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
    }

    void play() {
        for (Human human: listOfHumans) {
            human.setX(human.getX() + 1);
            human.setY(human.getY() + 0);
        }
        // TODO: Play
    }

    public void paint(Graphics g) {
        for (Human human: listOfHumans) {
            human.paint(g);
        }
        // TODO: On all objects: paint()
    }

}
