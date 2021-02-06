package gui;

import java.awt.*;

import javax.swing.*;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String TITLE_EPIDEMIC = "Epidemic";

	private GamePanel gamePanel;

	public GameFrame() {
		
		super(TITLE_EPIDEMIC);

		setResizable(false);

		gamePanel = new GamePanel();

		// add panel to frame
		add(gamePanel);

		pack();

		// set background of panel
		//gamePanel.setBackground(Color.LIGHT_GRAY);

		// set the size of frame
		setSize(800, 800);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, 0);

		setLayout(null);

		setVisible(true);
	}

	public void paintGame(Graphics g) {
		gamePanel.paintGame(g);
	}
}
