import model.Human;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Game {

    private List<Human> listOfHumans = new ArrayList<>();

    void newGame() {
        listOfHumans.add(new Human(300, 300));
        // TODO: Setup
    }

    void play() {
        for (Human human: listOfHumans) {
            human.setX(human.getX() + 1);
            human.setY(human.getY() + 0);
        }
        // TODO: Play
    }

    void paint(Graphics g) {
        for (Human human: listOfHumans) {
            human.paint(g);
        }
        // TODO: On all objects: paint()
    }

}
