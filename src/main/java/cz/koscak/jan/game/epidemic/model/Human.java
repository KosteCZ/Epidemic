package cz.koscak.jan.game.epidemic.model;

import cz.koscak.jan.game.epidemic.Game;

import java.util.List;

public class Human {

    //private static final int UI_SIZE = 16;
    private static final int DURATION_OF_INFECTED_STATE = 200;
    private static final int DURATION_OF_SICK_STATE = 500;
    private static final int DURATION_OF_IMMUNE_STATE = 500;

    private double x, y;
    private HumanState state;
    private int timeToNextState = -1;

    public Human(double x, double y) {
        this.x = x;
        this.y = y;
        setState(HumanState.HEALTHY);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public int getIntX() {
        //return (int) Math.round(x);
        return (int) Math.floor(x + 0.5d);
    }

    public int getIntY() {
        //return (int) Math.round(y);
        return (int) Math.floor(y + 0.5d);
    }

    public void setState(HumanState state) {
        if (HumanState.HEALTHY.equals(state)) {
            timeToNextState = -1;
        } else if (HumanState.INFECTED.equals(state)) {
            timeToNextState = DURATION_OF_INFECTED_STATE;
        } else if (HumanState.SICK.equals(state)) {
            timeToNextState = DURATION_OF_SICK_STATE;
        } else if (HumanState.IMMUNE.equals(state)) {
            timeToNextState = DURATION_OF_IMMUNE_STATE;
        }
        this.state = state;
    }

    public HumanState getState() {
        return state;
    }

    public void doAction(Game game, long time, List<Virus> listOfViruses) {
        // TODO: Do action
        if (HumanState.HEALTHY.equals(state) == false) {
            timeToNextState = timeToNextState - 1;
            if (timeToNextState <= 0) {
                if (HumanState.IMMUNE.equals(state)) {
                    setState(HumanState.HEALTHY);
                } else if (HumanState.SICK.equals(state)) {
                    setState(HumanState.IMMUNE);
                } else if (HumanState.INFECTED.equals(state)) {
                    setState(HumanState.SICK);
                }
            }
        }


        if (HumanState.INFECTED.equals(state) || HumanState.SICK.equals(state)) {
            if (time % 5 == 0) {
                listOfViruses.add(new Virus(x + Virus.MOUTH_X, y + Virus.MOUTH_Y));
            }
        }
    }

    public void infect() {
        setState(HumanState.INFECTED);
        timeToNextState = DURATION_OF_INFECTED_STATE;
    }

    /*public void paint(Graphics g) {
        //g.drawRect(getIntX(), getIntY(), UI_SIZE, UI_SIZE);
        // body
        printBody(g);
        g.setColor(Color.RED);
        g.drawOval(getIntX(), getIntY(), UI_SIZE, UI_SIZE);
        // eyes
        g.setColor(Color.black);
        g.drawOval(getIntX() + 4, getIntY() + 5, 3, 3);
        g.setColor(Color.black);
        g.drawOval(getIntX() + 9, getIntY() + 5, 3, 3);
        // mouth
        g.setColor(Color.black);
        g.drawLine(getIntX() + 4, getIntY() + 11, getIntX() + 12, getIntY() + 11);
        g.setColor(Color.black);
        g.drawLine(getIntX() + 5, getIntY() + 12, getIntX() + 11, getIntY() + 12);
        g.setColor(Color.black);
        g.drawLine(getIntX() + 7, getIntY() + 13, getIntX() + 9, getIntY() + 13);
    }

    private void printBody(Graphics g) {
        if (HumanState.HEALTHY.equals(state)) {
            g.setColor(Color.YELLOW);
        } else if (HumanState.INFECTED.equals(state)) {
            g.setColor(Color.CYAN);
        }if (HumanState.SICK.equals(state)) {
            g.setColor(Color.GREEN);
        }if (HumanState.IMMUNE.equals(state)) {
            g.setColor(Color.ORANGE);
        }if (HumanState.DEAD.equals(state)) {
            g.setColor(Color.DARK_GRAY);
        }
        g.fillOval(getIntX(), getIntY(), UI_SIZE, UI_SIZE);
    }*/

}
