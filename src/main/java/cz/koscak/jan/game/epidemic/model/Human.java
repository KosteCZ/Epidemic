package cz.koscak.jan.game.epidemic.model;

import java.awt.*;

public class Human {

    private static final int UI_SIZE = 16;
    private double x, y;

    public Human(double x, double y) {
        this.x = x;
        this.y = y;
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

    private int getIntX() {
        return (int) Math.round(x);
    }

    private int getIntY() {
        return (int) Math.round(y);
    }

    public void paint(Graphics g) {
        //g.drawRect(getIntX(), getIntY(), UI_SIZE, UI_SIZE);
        // body
        g.setColor(Color.YELLOW);
        g.fillOval(getIntX(), getIntY(), UI_SIZE, UI_SIZE);
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
    }

}
