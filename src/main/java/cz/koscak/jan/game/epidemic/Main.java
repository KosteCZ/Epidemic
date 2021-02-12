package cz.koscak.jan.game.epidemic;

import cz.koscak.jan.game.epidemic.gui.GameFrame;
import cz.koscak.jan.game.epidemic.model.Game;

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
        Thread threadUI = new Thread(() -> {
            try {
                while (true) {
                    gameFrame.repaint();
                    //game.play();
                    Thread.sleep(50);
                }
            } catch (InterruptedException exception) {
                System.err.println("ERROR: " + exception.getMessage());
                exception.printStackTrace();
            }
        });
        threadUI.start();
        Thread threadGame = new Thread(() -> {
            try {
                while (true) {
                    //gameFrame.repaint();
                    game.play();
                    Thread.sleep(game.getSpeedDelay());
                }
            } catch (InterruptedException exception) {
                System.err.println("ERROR: " + exception.getMessage());
                exception.printStackTrace();
            }
        });
        threadGame.start();
    }

}
