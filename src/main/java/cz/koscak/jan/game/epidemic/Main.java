package cz.koscak.jan.game.epidemic;

import cz.koscak.jan.game.epidemic.gui.GameFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.setProperty("sun.java2d.uiScale", "1.0");

        Game game = new Game();
        game.newGame();

        GameFrame gameFrame = new GameFrame(game);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Main main = new Main();
        main.runGame(gameFrame, game);
    }

    private void runGame(GameFrame gameFrame, Game game) {
        Runnable r1 = () -> {
            try {
                while (true) {
                    gameFrame.repaint();
                    game.play();
                    Thread.sleep(100);
                }
            } catch (InterruptedException exception) {
                System.err.println("ERROR: " + exception.getMessage());
                exception.printStackTrace();
            }
        };
        r1.run();
    }

}
