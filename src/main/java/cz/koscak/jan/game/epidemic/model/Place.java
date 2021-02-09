package cz.koscak.jan.game.epidemic.model;

public class Place {

    private int x, y;
    private PlaceType type;
    private Area area;

    public Place(int x, int y, PlaceType type, Area area) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.area = area;
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

    public Area getAreaType() {
        return area;
    }

}
