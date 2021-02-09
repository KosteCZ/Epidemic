package cz.koscak.jan.game.epidemic.model;

public class Place {

    private int x, y;
    private PlaceType type;

    public Place(int x, int y, PlaceType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public PlaceType getType() {
        return type;
    }
}
