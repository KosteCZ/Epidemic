package cz.koscak.jan.game.epidemic.model;

import java.util.List;
import java.util.Random;

public class Human {

    private static final int DURATION_OF_INFECTED_STATE = 500;
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
    private boolean faceMask = false;
    private boolean protesting = false;

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

    public Area getArea() {
        return area;
    }

    public int getPosition() {
        return position;
    }

    public boolean hasFaceMask() {
        return faceMask;
    }

    public void setFaceMask(boolean hasFaceMask) {
        this.faceMask = hasFaceMask;
    }

    public boolean isProtesting() {
        return protesting;
    }

    public void setProtesting(boolean protesting) {
        this.protesting = protesting;
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
        if (HumanState.DEAD.equals(state)) return;
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
            if (targetPlace != null && PlaceType.HOME.equals(targetPlace.getType()) && HumanState.SICK.equals(state)) {
                setFaceMask(true);
                return;
            }

            if (position > 0) {
                if (targetPlace != null && PlaceType.PROTEST_PLACE.equals(targetPlace.getType())) {
                    targetPlace.setFree(true);
                    setProtesting(false);
                }

                PlaceType targetPlaceType = PlaceType.HOME;
                Area targetArea = area;
                int targetPosition = position;
                Random random = new Random();

                timeToNextMove = 100;

                boolean goingProtest = false;
                if (game.getPes() >= 2) {
                    int chanceOfProtesting = 100 - ((game.getPes() - 2) * 15) - (game.getDead() * 5);
                    int randomNumberForProtesting = random.nextInt(chanceOfProtesting);
                    if (randomNumberForProtesting == 0) {
                        for (Place place : game.getListOfProtestPlaces()) {
                            if (place.isFree()) {
                                goingProtest = true;
                                place.setFree(false);
                                targetPlace = place;
                                setProtesting(true);
                                timeToNextMove = 300;
                                break;
                            }
                        }
                    }
                }
                if (!goingProtest) {
                    int randomNumberFarMovement = random.nextInt(50);
                    if ((randomNumberFarMovement == 0) && (position % 2 == 0) && (position <= 22)) {
                        if (game.getPes() < 4 || position == 30 || position == 32) {
                            if (game.isDebugMode())
                                System.out.print("SPECIAL MOVE: Human position: " + position + " area: " + area);
                            if (position % 4 == 0) {
                                targetArea = game.getAreaForNumber(game.getNumberOfArea(area) - 1);
                            } else {
                                targetArea = game.getAreaForNumber(game.getNumberOfArea(area) + 1);
                            }
                            targetPosition = 25 + (position / 2);
                            if (game.isDebugMode())
                                System.out.println(" , moving to position: " + targetPosition + " in area: " + targetArea);
                        }
                    } else {
                        int randomNumber = random.nextInt(4);
                        if (game.isDebugMode()) System.out.print("Random: " + randomNumber + ". ");
                        if (randomNumber == 0) {
                            if (game.isDebugMode()) System.out.println("Going to " + PlaceType.HOME);
                            targetPlaceType = PlaceType.HOME;
                        } else if (randomNumber == 1) {
                            if (game.isDebugMode()) System.out.println("Going to " + PlaceType.WORK);
                            if (game.getPes() >= 1
                                    && (position == 1 || position == 4 || position == 5 || position == 20
                                    || position == 8 || position == 15 || position == 23 || position == 26
                                    || position == 22 || position == 10 || position == 25 || position == 31
                                    || position == 33 || position == 34 || position == 35 || position == 36)) {
                                targetPlaceType = PlaceType.HOME;
                            } else {
                                targetPlaceType = PlaceType.WORK;
                            }
                        } else if (randomNumber == 2) {
                            if (game.isDebugMode()) System.out.println("Going to " + PlaceType.SHOP);
                            if (game.getPes() >= 5
                                    && (position == 1 || position == 4 || position == 8 || position == 15
                                    || position == 16 || position == 19 || position == 27 || position == 28
                                    || position == 5 || position == 20 || position == 23 || position == 26
                                    || position == 3 || position == 6 || position == 12 || position == 18
                                    || position == 21 || position == 9 || position == 29 || position == 30)) {
                                targetPlaceType = PlaceType.HOME;
                            } else {
                                targetPlaceType = PlaceType.SHOP;
                            }
                        } else if (randomNumber == 3) {
                            if (game.isDebugMode()) System.out.println("Going to " + PlaceType.SPORT);
                            targetPlaceType = PlaceType.SPORT;
                        }
                    }
                    targetPlace = game.findPlace(targetArea, targetPlaceType, targetPosition);
                }

                if(targetPlace != null) {
                    if (game.isDebugMode()) {
                        System.out.println("Area: " + targetPlace.getArea() + ", type: " + targetPlace.getType()
                                + ", position: " + targetPlace.getPosition() + ", x:" + targetPlace.getXForHuman() + ", y:" + targetPlace.getYForHuman());
                        System.out.println("x: " + x + ", y: " + y);
                    }

                    // Set moving to that target
                    double x_difference = targetPlace.getXForHuman() - x;
                    double y_difference = targetPlace.getYForHuman() - y;
                    if (game.isDebugMode()) {
                        System.out.println("Difference: " + (x_difference + y_difference));
                    }
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
                    System.out.println("Error: Human moving: No place found!!!");
                }
            }
        }
        if (moving == false && timeToNextMove > 0) {
            // Waiting in current place
            timeToNextMove = timeToNextMove - 1;
        }
        if (moving == true) {
            if (game.getPes() >= 2) {
                setFaceMask(true);
            } else {
                setFaceMask(false);
            }
            x = x + vx;
            y = y + vy;
            if (targetPlace.getXForHuman() == getIntX() && targetPlace.getYForHuman() == getIntY()) {
                x = targetPlace.getXForHuman();
                y = targetPlace.getYForHuman();
                moving = false;
                if (PlaceType.SHOP.equals(targetPlace.getType())) {
                    if (game.getPes() >= 3) {
                        setFaceMask(true);
                    } else {
                        setFaceMask(false);
                    }
                } else if (PlaceType.HOME.equals(targetPlace.getType()) && HumanState.SICK.equals(state)) {
                    setFaceMask(true);
                } else {
                    setFaceMask(false);
                }
            }
        }
    }

    private void produceVirus(long time, List<Virus> listOfViruses) {
        if (HumanState.INFECTED.equals(state) || HumanState.SICK.equals(state)) {
            if (time % 5 == 0) {
                if (targetPlace == null) {
                    System.err.println("ERROR: Produce Virus (no target place) - Human Position Setup probably failed for Human: "
                            + "x:" + getIntX() + ", y:" + getIntY() + ", area:" + area + ", position:" + position
                            + ", targetPlace:" + targetPlace);
                }
                if (moving == false && PlaceType.HOME.equals(targetPlace.getType())) {
                    if (time % 20 == 0) {
                        listOfViruses.add(new Virus(x + Virus.MOUTH_X, y + Virus.MOUTH_Y, Virus.TIME_OF_SPREADING_VERY_LIMITED));
                    }
                } else {
                    if (hasFaceMask()) {
                        listOfViruses.add(new Virus(x + Virus.MOUTH_X, y + Virus.MOUTH_Y, Virus.TIME_OF_SPREADING_LIMITED));
                    } else {
                        listOfViruses.add(new Virus(x + Virus.MOUTH_X, y + Virus.MOUTH_Y, Virus.TIME_OF_SPREADING_FULL));
                    }
                }
            }
        }
    }

    public void infect() {
        setState(HumanState.INFECTED);
        timeToNextState = DURATION_OF_INFECTED_STATE;
    }

    public void prolongSickness() {
        timeToNextState = timeToNextState + (DURATION_OF_INFECTED_STATE / 2);
        if (timeToNextState > DURATION_OF_INFECTED_STATE * 2) {
            timeToNextState = DURATION_OF_INFECTED_STATE * 2;
        }
    }

}
