package cz.koscak.jan.game.epidemic.gui;

import java.awt.*;

import javax.swing.*;

import cz.koscak.jan.game.epidemic.model.Game;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String TITLE_EPIDEMIC = "Epidemic";

	public GameFrame(Game game) {
		
		super(TITLE_EPIDEMIC);

		//setSize(825, 825);
		//setPreferredSize(new Dimension(825, 825));
		setResizable(false);

		//setLayout(null);
		//setLocationRelativeTo(null);

		GamePanel gamePanel = new GamePanel(game);
		add(gamePanel);

		pack();

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, 0);

		setVisible(true);

		if (game.isDebugMode()) System.out.println("Frame Size: " + getSize());
	}

}
