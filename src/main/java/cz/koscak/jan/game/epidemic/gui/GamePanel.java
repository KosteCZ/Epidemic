package cz.koscak.jan.game.epidemic.gui;

import cz.koscak.jan.game.epidemic.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final Game game;
	private Images images;

//	private static final int HEIGHT = 800;
//	private static final int WIDTH = 800;

	GamePanel(Game game) {
		this.game = game;
		//setPreferredSize(new Dimension(WIDTH, HEIGHT));
		//setBackground(Color.BLACK);

		//setPreferredSize(new Dimension(825, 825));
		setPreferredSize(new Dimension(800, 828));
		//setSize(790, 790);

		setDoubleBuffered(true);
		//setFocusable(true);
		setLayout(null);

		//System.out.println("Panel Size: " + getSize());

		addPauseButton();

		images = new Images();
	}

	private void addPauseButton() {
		JButton buttonPause = new JButton("Resume");
		buttonPause.setBounds(0, 1, 90, 28);

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

		Graphics2D g2 = (Graphics2D) g;

		//game.paint(g2);

		paintGame(g2);

		paintPlaces(g2);

		paintHumans(g2);
	}

    private void paintPlaces(Graphics g) {
        for(Place place: game.getListOfPlaces()) {
            //g.drawImage(images.humanHealthy, place.getXForPainting(), place.getYForPainting(), this);
            g.setColor(Color.BLACK);
            if (Area.QUADRANT_TOP_LEFT.equals(place.getArea())) g.setColor(Color.GREEN);
            if (Area.QUADRANT_TOP_RIGHT.equals(place.getArea())) g.setColor(Color.ORANGE);
            if (Area.QUADRANT_BOTTOM_LEFT.equals(place.getArea())) g.setColor(Color.BLUE);
            if (Area.QUADRANT_BOTTOM_RIGHT.equals(place.getArea())) g.setColor(Color.RED);
            g.drawOval(place.getXForPainting(), place.getYForPainting(), 15, 15);
            g.drawRect(place.getXForPainting(), place.getYForPainting(), 15, 15);
            g.setColor(Color.RED);
            g.drawString(String.valueOf(place.getPosition()), place.getXForPainting() + 1 , place.getYForPainting() + 12);
        }
    }

    private void paintHumans(Graphics g) {
        for (Human human : game.getListOfHumans()) {
            if (HumanState.HEALTHY.equals(human.getState())) {
                g.drawImage(images.humanHealthy, human.getIntX(), human.getIntY(), this);
            } else if (HumanState.INFECTED.equals(human.getState())) {
                g.drawImage(images.humanInfected, human.getIntX(), human.getIntY(), this);
            } else if (HumanState.SICK.equals(human.getState())) {
                g.drawImage(images.humanSick, human.getIntX(), human.getIntY(), this);
            } else if (HumanState.IMMUNE.equals(human.getState())) {
                g.drawImage(images.humanImmune, human.getIntX(), human.getIntY(), this);
            } else if (HumanState.DEAD.equals(human.getState())) {
                g.drawImage(images.humanDead, human.getIntX(), human.getIntY(), this);
            } else {
                System.err.println("ERROR - printing human - unknown state!");
                System.err.println("ERROR - printing human - state: " + human.getState());
                g.setColor(Color.YELLOW);
                g.fillRect(human.getIntX(), human.getIntY(), 16, 16);
                g.setColor(Color.BLACK);
                g.drawRect(human.getIntX(), human.getIntY(), 16, 16);
            }
        }

        g.setColor(Color.RED);
        ListIterator<Virus> iteratorVirus = game.getListOfViruses().listIterator();
        try {
            while(iteratorVirus.hasNext()) {
                    Virus virus = iteratorVirus.next();
                    g.drawRect(virus.getIntX(), virus.getIntY(), 3, 3);
            }
        } catch (ConcurrentModificationException exception) {
            // Ignore
        }
    }


	private void paintGame(Graphics g) {

		//paintArena(g);

		//g.setColor(Color.LIGHT_GRAY);
		//g.fillRect(7, 30, 786, 763);

		g.drawImage(images.map, 0, 28, this);

		g.setColor(Color.BLACK);
		g.drawString("Speed: (PAUSED, 1, 2, 4)", 100, 21);
		g.drawString("PES: (0-5)", 300, 21);
        g.drawString("Deaths: (0-100)", 400, 21);
        g.drawString("Time: " + game.getTime(), 500, 21);
		g.setColor(Color.RED);
		g.drawRect(-1, 28/*31*/ /*+ 25*/, 801, 801);

		g.setColor(Color.BLUE);
		g.drawRect(0, 28 + 0, 399, 399);
		g.setColor(Color.MAGENTA);
		g.drawRect(0, 28 + 400, 399, 399);
		g.setColor(Color.GREEN);
		g.drawRect(400, 28 + 0, 399, 399);
		g.setColor(Color.YELLOW);
		g.drawRect(400, 28 + 400, 399, 399);

		g.drawImage(images.humanHealthy, 420, 300, this);
		g.drawImage(images.humanSick, 420, 325, this);

		/*for (Human human: game.getListOfHumans()) {
			human.paint(g);
		}*/
	}

	/*private void paintArena(Graphics g) {
		//g.drawRect(40, 10, WIDTH, HEIGHT);
	}*/

}
