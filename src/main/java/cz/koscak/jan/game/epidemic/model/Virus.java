package cz.koscak.jan.game.epidemic.model;

import java.util.List;

public class Virus {

    public static final int MOUTH_X = 5;
    public static final int MOUTH_Y = 7;
    public static final int TIME_OF_SPREADING_FULL = 70;
    public static final int TIME_OF_SPREADING_LIMITED = 40;
    public static final int TIME_OF_SPREADING_VERY_LIMITED = 20;

    private double x, y;
    private int timeToDeath;
    private double angle; // in radians - makes math easier

    public Virus(double x, double y, int timeOfSpreading) {
        this.x = x;
        this.y = y;
        angle = Math.PI * 2 * Math.random(); // Math.PI * 2 = 360 degrees
        timeToDeath = timeOfSpreading;
    }

    public boolean doAction(List<Human> listOfHumans) {
        timeToDeath = timeToDeath - 1;
        x = x + Math.sin(angle);
        y = y + Math.cos(angle);

        for (Human human: listOfHumans) {
            if (human.getIntX() + MOUTH_X == getIntX() && human.getIntY() + MOUTH_Y == getIntY()) {
                if (HumanState.HEALTHY.equals(human.getState())) {
                    human.infect();
                    return false;
                } else if (HumanState.SICK.equals(human.getState())) {
                    human.prolongSickness();
                    return false;
                }
            }
        }

        if (timeToDeath <= 0) return false;
        return true;
    }

    public int getIntX() {
        //return (int) Math.round(x);
        return (int) Math.floor(x + 0.5d);
    }

    public int getIntY() {
        //return (int) Math.round(y);
        return (int) Math.floor(y + 0.5d);
    }

}
