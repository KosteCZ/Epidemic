package cz.koscak.jan.game.epidemic.model;

import java.util.List;
import java.util.Random;

public class Human {

    //private static final int UI_SIZE = 16;
    private static final int DURATION_OF_INFECTED_STATE = 200;
    private static final int DURATION_OF_SICK_STATE = 500;
    private static final int DURATION_OF_IMMUNE_STATE = 500;

    private double x, y;
    private double vx, vy;
    private HumanState state;
    private int timeToNextState = -1;
    private int timeToNextMove = 0;
    private Area area;
    private int position = 0;
    private boolean moving = false;
    private Place targetPlace;

    public Human(double x, double y) {
        this.x = x;
        this.y = y;
        setState(HumanState.HEALTHY);
    }

    public Human(double x, double y, Area area, int position) {
        this.x = x;
        this.y = y;
        setState(HumanState.HEALTHY);
        this.area = area;
        this.position = position;
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
        changeStateWithTime();
        move(game);
        produceVirus(time, listOfViruses);
    }

    private void changeStateWithTime() {
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
    }

    private void move(Game game) {
        if (moving == false && timeToNextMove == 0) {
            if (position > 0) {
                Random random = new Random();
                int randomNumber = random.nextInt(4);
                System.out.print("Random: " + randomNumber + ". ");
                PlaceType targetPlaceType = PlaceType.HOME;
                if (randomNumber == 0) {
                    System.out.println("Going to " + PlaceType.HOME);
                    targetPlaceType = PlaceType.HOME;
                } else if (randomNumber == 1) {
                    System.out.println("Going to " + PlaceType.WORK);
                    targetPlaceType = PlaceType.WORK;
                } else if (randomNumber == 2) {
                    System.out.println("Going to " + PlaceType.SHOP);
                    targetPlaceType = PlaceType.SHOP;
                } else if (randomNumber == 3) {
                    System.out.println("Going to " + PlaceType.SPORT);
                    targetPlaceType = PlaceType.SPORT;
                }
                timeToNextMove = 50;

                targetPlace = game.findPlace(area, targetPlaceType, position);
                if(targetPlace != null) {
                    System.out.println("Area: " + targetPlace.getArea() + ", type: " + targetPlace.getType()
                            + ", position: " + targetPlace.getPosition() + ", x:" + targetPlace.getXForHuman() + ", y:" + targetPlace.getYForHuman());
                    System.out.println("x: " + x + ", y: " + y);

                    // Set moving to that target
                    double x_difference = targetPlace.getXForHuman() - x;
                    double y_difference = targetPlace.getYForHuman() - y;
                    System.out.println("Difference: " + (x_difference + y_difference));
                    double z_difference = Math.sqrt((x_difference * x_difference) + (y_difference * y_difference));
                    if (z_difference != 0) {
                        this.vx = x_difference / z_difference;
                        this.vy = y_difference / z_difference;
                    } else {
                        this.vx = 0;
                        this.vy = 0;
                    }
                    moving = true;
                } else {
                    System.out.println("No place find!!!");
                }
            }
        }
        if (moving == false && timeToNextMove > 0) {
            // Waiting in current place
            timeToNextMove = timeToNextMove - 1;
        }
        if (moving == true) {
            x = x + vx;
            y = y + vy;
            if (targetPlace.getXForHuman() == getIntX() && targetPlace.getYForHuman() == getIntY()) {
                x = targetPlace.getXForHuman();
                y = targetPlace.getYForHuman();
                moving = false;
            }
        }
    }

    private void produceVirus(long time, List<Virus> listOfViruses) {
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
