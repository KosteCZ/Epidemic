import gui.GameFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame("Epidemic");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game();
        game.newGame();

        Main main = new Main();
        main.runGame(gameFrame, game);
    }

    private void runGame(GameFrame gameFrame, Game game) {
        Graphics g = gameFrame.getGraphics();
        Runnable r1 = () -> {
            try {
                while (true) {
                    //gameFrame.repaint();
                    gameFrame.paintGame(g);
                    game.play();
                    game.paint(g);

                    //System.out.println("Hello, world!");
                    Thread.sleep(100);
                }
            } catch (InterruptedException iex) {
                System.err.println("ERROR: " + iex.getMessage());
                iex.printStackTrace();
            }
        };
        r1.run();
    }

}
