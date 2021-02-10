package cz.koscak.jan.game.epidemic.model;

public class Virus {

    private double x, y;
    private int timeToDeath = 30;
    private double angle; // in radians - makes math easier

    public Virus(double x, double y) {
        this.x = x;
        this.y = y;
        angle = Math.PI * 2 * Math.random(); // Math.PI * 2 = 360 degrees
    }

    public boolean doAction() {
        timeToDeath = timeToDeath - 1;
        x = x + Math.sin(angle);
        y = y + Math.cos(angle);
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
