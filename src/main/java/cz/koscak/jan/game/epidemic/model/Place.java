package cz.koscak.jan.game.epidemic.model;

public class Place {

    private int x, y;
    private PlaceType type;
    private Area area;
    private int position;

    public Place(int x, int y, PlaceType type, Area area, int position) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.area = area;
        this.position = position;
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

    public Area getArea() {
        return area;
    }

    public int getPosition() {
        return position;
    }
}
