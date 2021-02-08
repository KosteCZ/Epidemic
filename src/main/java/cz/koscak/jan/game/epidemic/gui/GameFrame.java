package cz.koscak.jan.game.epidemic.gui;

import java.awt.*;

import javax.swing.*;

import cz.koscak.jan.game.epidemic.Game;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String TITLE_EPIDEMIC = "Epidemic";

	public GameFrame(Game game) {
		
		super(TITLE_EPIDEMIC);


		//pack();
		setSize(825, 825);
		setResizable(false);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, 0);

		//setLayout(null);

		GamePanel gamePanel = new GamePanel(game);
		add(gamePanel);

		setVisible(true);
	}

}
