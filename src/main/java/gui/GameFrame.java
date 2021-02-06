package gui;

import java.awt.*;

import javax.swing.*;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private GamePanel gamePanel;

	public GameFrame(String name) {
		
		super(name);
		
		gamePanel = new GamePanel();

		// set background of panel
		gamePanel.setBackground(Color.LIGHT_GRAY);

		// add panel to frame
        add(gamePanel);

		// set the size of frame
		setSize(800, 800);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, 0);

		JButton buttonNew = new JButton("New");
		buttonNew.setBounds(0, 1, 70, 30);
		add(buttonNew);

		setLayout(null);

		setVisible(true);
	}

	public void paintGame(Graphics g) {
		gamePanel.paintGame(g);
	}
}
