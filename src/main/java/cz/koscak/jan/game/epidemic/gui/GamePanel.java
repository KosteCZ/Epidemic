package cz.koscak.jan.game.epidemic.gui;

import cz.koscak.jan.game.epidemic.Game;
import cz.koscak.jan.game.epidemic.GameStatus;
import cz.koscak.jan.game.epidemic.model.Human;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final Game game;

	//private static final int HEIGHT = 500;
	//private static final int WIDTH = 500;

	GamePanel(Game game) {
		this.game = game;
		//setPreferredSize(new Dimension(WIDTH, HEIGHT));
		//setBackground(Color.BLACK);

		setDoubleBuffered(true);
		//setFocusable(true);
		setLayout(null);

		addPauseButton();
	}

	private void addPauseButton() {
		JButton buttonPause = new JButton("Pause");
		buttonPause.setBounds(0, 1, 80, 30);

		buttonPause.addActionListener(event -> {
            GameStatus gameStatus = game.getGameStatus();
            if (GameStatus.PLAY.equals(gameStatus)) {
                game.setGameStatus(GameStatus.PAUSED);
                buttonPause.setText("Resume");
            }
            if (GameStatus.PAUSED.equals(gameStatus)) {
                game.setGameStatus(GameStatus.PLAY);
                buttonPause.setText("Pause");
            }
        });

		add(buttonPause);
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		game.paint(g);

		paintGame(g);

	}

	private void paintGame(Graphics g) {

		//paintArena(g);

		//g.setColor(Color.LIGHT_GRAY);
		//g.fillRect(7, 30, 786, 763);

		g.setColor(Color.BLACK);
		g.drawString("Speed: (PAUSED, 1, 2, 4)", 100, 50);
		g.drawString("PES: (0-5)", 300, 50);
		g.drawString("Deaths: (0-100)", 400, 50);
		g.drawRect(100, 100, 50, 50);
		g.drawOval(100, 200, 50, 50);
		g.drawRect(100, 700, 80, 80);
		g.drawRect(7, 35 + 25, 720, 720);

		//TEST-delete it
		Human human = new Human(200, 200);
		human.paint(g);
		Human human2 = new Human(230, 200);
		human2.paint(g);
		Human human3 = new Human(200, 230);
		human3.paint(g);
	}

	/*private void paintArena(Graphics g) {
		//g.drawRect(40, 10, WIDTH, HEIGHT);
	}*/

}
