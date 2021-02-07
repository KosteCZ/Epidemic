package cz.koscak.jan.game.epidemic.gui;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Images {

    public Image humanHealthy;
    public Image humanSick;

    public Images() {
        try {
            humanHealthy = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("human-healthy.png")));
            humanSick = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("human-sick.png")));
        } catch (IOException exception) {
            System.err.println("Loading image error: " + exception);
            exception.printStackTrace();
        }
    }
}
