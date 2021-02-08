package cz.koscak.jan.game.epidemic.gui;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

class Images {

    Image map;
    Image humanHealthy;
    Image humanInfected;
    Image humanSick;
    Image humanImmune;
    Image humanDead;

    Images() {
        try {
            map = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("map-7.png")));
            humanHealthy = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("human-healthy.png")));
            humanInfected = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("human-infected.png")));
            humanSick = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("human-sick.png")));
            humanImmune = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("human-immune.png")));
            humanDead = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("human-dead.png")));
        } catch (IOException exception) {
            System.err.println("Loading image error: " + exception);
            exception.printStackTrace();
        }
    }
}
