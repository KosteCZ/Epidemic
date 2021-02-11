package cz.koscak.jan.game.epidemic.model;

import java.util.List;

public class GameSetup {

    public static void addPlaces(List<Place> listOfPlaces) {
        addPlacesTopLeft(listOfPlaces);
        addPlacesTopRight(listOfPlaces);
    }

    private static void addPlacesTopLeft(List<Place> listOfPlaces) {
        // --------------------- TOP LEFT ---------------------------
        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + i * 21, 28 + 5 + j * 21,
                        PlaceType.SHOP, Area.QUADRANT_TOP_LEFT));
            }
        }*/
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 1));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 4));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 5));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 20));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 2));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 13));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 8));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 15));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 23));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 26));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 24));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 14));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 16));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 19));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 3));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 6));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 21));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 9));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 27));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 28));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 12));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 18));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 29));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 30));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 7));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 11));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 22));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 10));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 31));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 32));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 17));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 25));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 33));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 34));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 35));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_LEFT, 36));

        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + 200 + i * 21, 28 + 5 + j * 21,
                        PlaceType.SPORT, Area.QUADRANT_TOP_LEFT));
            }
        }*/
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 1));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 3));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 4));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 5));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 14));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 15));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 2));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 13));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 19));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 20));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 26));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 27));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 6));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 7));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 11));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 12));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 8));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 9));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 23));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 24));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 28));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 29));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 30));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 31));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 16));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 10));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 32));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 33));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 18));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 21));
        listOfPlaces.add(new Place(5 + 200 + 0 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 17));
        listOfPlaces.add(new Place(5 + 200 + 1 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 25));
        listOfPlaces.add(new Place(5 + 200 + 2 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 34));
        listOfPlaces.add(new Place(5 + 200 + 3 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 35));
        listOfPlaces.add(new Place(5 + 200 + 4 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 36));
        listOfPlaces.add(new Place(5 + 200 + 5 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_LEFT, 22));

        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + i * 21, 28 + 5 + 200 + j * 21,
                        PlaceType.WORK, Area.QUADRANT_TOP_LEFT));
            }
        }*/
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 1));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 4));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 5));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 20));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 2));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 13));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 8));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 15));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 23));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 26));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 24));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 14));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 16));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 19));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 3));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 6));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 21));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 9));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 12));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 18));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 27));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 28));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 29));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 30));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 7));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 11));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 22));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 10));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 25));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 31));
        listOfPlaces.add(new Place(5 + 0 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 17));
        listOfPlaces.add(new Place(5 + 1 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 32));
        listOfPlaces.add(new Place(5 + 2 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 33));
        listOfPlaces.add(new Place(5 + 3 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 34));
        listOfPlaces.add(new Place(5 + 4 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 35));
        listOfPlaces.add(new Place(5 + 5 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_LEFT, 36));

        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(5 + 200 + i * 21, 28 + 5 + 200 + j * 21,
                        PlaceType.HOME, Area.QUADRANT_TOP_LEFT));
            }
        }*/
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 1));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 26));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 4));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 5));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 27));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 8));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 2));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 3));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 6));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 7));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 9));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 10));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 11));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 28));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 30));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 31));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 33));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 14));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 29));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 12));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 13));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 32));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 15));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 34));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 16));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 35));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 19));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 20));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 36));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 23));
        listOfPlaces.add(new Place(6 + 200 + 0 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 17));
        listOfPlaces.add(new Place(1 + 200 + 1 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 18));
        listOfPlaces.add(new Place(7 + 200 + 2 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 21));
        listOfPlaces.add(new Place(2 + 200 + 3 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 22));
        listOfPlaces.add(new Place(9 + 200 + 4 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 24));
        listOfPlaces.add(new Place(4 + 200 + 5 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_LEFT, 25));
    }

    private static void addPlacesTopRight(List<Place> listOfPlaces) {
        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(474 + 200 + i * 21, 28 + 5 + j * 21,
                        PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT));
            }
        }*/
        listOfPlaces.add(new Place(474 + 0 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 1));
        listOfPlaces.add(new Place(474 + 1 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 3));
        listOfPlaces.add(new Place(474 + 2 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 4));
        listOfPlaces.add(new Place(474 + 3 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 5));
        listOfPlaces.add(new Place(474 + 4 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 14));
        listOfPlaces.add(new Place(474 + 5 * 21, 28 + 5 + 0 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 15));
        listOfPlaces.add(new Place(474 + 0 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 2));
        listOfPlaces.add(new Place(474 + 1 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 13));
        listOfPlaces.add(new Place(474 + 2 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 19));
        listOfPlaces.add(new Place(474 + 3 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 20));
        listOfPlaces.add(new Place(474 + 4 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 26));
        listOfPlaces.add(new Place(474 + 5 * 21, 28 + 5 + 1 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 27));
        listOfPlaces.add(new Place(474 + 0 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 6));
        listOfPlaces.add(new Place(474 + 1 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 7));
        listOfPlaces.add(new Place(474 + 2 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 11));
        listOfPlaces.add(new Place(474 + 3 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 12));
        listOfPlaces.add(new Place(474 + 4 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 8));
        listOfPlaces.add(new Place(474 + 5 * 21, 28 + 5 + 2 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 9));
        listOfPlaces.add(new Place(474 + 0 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 23));
        listOfPlaces.add(new Place(474 + 1 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 24));
        listOfPlaces.add(new Place(474 + 2 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 28));
        listOfPlaces.add(new Place(474 + 3 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 29));
        listOfPlaces.add(new Place(474 + 4 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 30));
        listOfPlaces.add(new Place(474 + 5 * 21, 28 + 5 + 3 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 31));
        listOfPlaces.add(new Place(474 + 0 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 16));
        listOfPlaces.add(new Place(474 + 1 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 10));
        listOfPlaces.add(new Place(474 + 2 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 32));
        listOfPlaces.add(new Place(474 + 3 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 33));
        listOfPlaces.add(new Place(474 + 4 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 18));
        listOfPlaces.add(new Place(474 + 5 * 21, 28 + 5 + 4 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 21));
        listOfPlaces.add(new Place(474 + 0 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 17));
        listOfPlaces.add(new Place(474 + 1 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 25));
        listOfPlaces.add(new Place(474 + 2 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 34));
        listOfPlaces.add(new Place(474 + 3 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 35));
        listOfPlaces.add(new Place(474 + 4 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 36));
        listOfPlaces.add(new Place(474 + 5 * 21, 28 + 5 + 5 * 21,
                PlaceType.SPORT, Area.QUADRANT_TOP_RIGHT, 22));

        listOfPlaces.add(new Place(474 + 200 +  0 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 1));
        listOfPlaces.add(new Place(474 + 200 +  1 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 4));
        listOfPlaces.add(new Place(474 + 200 +  2 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 5));
        listOfPlaces.add(new Place(474 + 200 +  3 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 20));
        listOfPlaces.add(new Place(474 + 200 +  4 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 2));
        listOfPlaces.add(new Place(474 + 200 +  5 * 21, 28 + 5 + 0 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 13));
        listOfPlaces.add(new Place(474 + 200 +  0 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 8));
        listOfPlaces.add(new Place(474 + 200 +  1 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 15));
        listOfPlaces.add(new Place(474 + 200 +  2 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 23));
        listOfPlaces.add(new Place(474 + 200 +  3 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 26));
        listOfPlaces.add(new Place(474 + 200 +  4 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 24));
        listOfPlaces.add(new Place(474 + 200 +  5 * 21, 28 + 5 + 1 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 14));
        listOfPlaces.add(new Place(474 + 200 +  0 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 16));
        listOfPlaces.add(new Place(474 + 200 +  1 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 19));
        listOfPlaces.add(new Place(474 + 200 +  2 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 3));
        listOfPlaces.add(new Place(474 + 200 +  3 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 6));
        listOfPlaces.add(new Place(474 + 200 +  4 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 21));
        listOfPlaces.add(new Place(474 + 200 +  5 * 21, 28 + 5 + 2 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 9));
        listOfPlaces.add(new Place(474 + 200 +  0 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 27));
        listOfPlaces.add(new Place(474 + 200 +  1 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 28));
        listOfPlaces.add(new Place(474 + 200 +  2 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 12));
        listOfPlaces.add(new Place(474 + 200 +  3 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 18));
        listOfPlaces.add(new Place(474 + 200 +  4 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 29));
        listOfPlaces.add(new Place(474 + 200 +  5 * 21, 28 + 5 + 3 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 30));
        listOfPlaces.add(new Place(474 + 200 +  0 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 7));
        listOfPlaces.add(new Place(474 + 200 +  1 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 11));
        listOfPlaces.add(new Place(474 + 200 +  2 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 22));
        listOfPlaces.add(new Place(474 + 200 +  3 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 10));
        listOfPlaces.add(new Place(474 + 200 +  4 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 31));
        listOfPlaces.add(new Place(474 + 200 +  5 * 21, 28 + 5 + 4 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 32));
        listOfPlaces.add(new Place(474 + 200 +  0 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 17));
        listOfPlaces.add(new Place(474 + 200 +  1 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 25));
        listOfPlaces.add(new Place(474 + 200 +  2 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 33));
        listOfPlaces.add(new Place(474 + 200 +  3 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 34));
        listOfPlaces.add(new Place(474 + 200 +  4 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 35));
        listOfPlaces.add(new Place(474 + 200 +  5 * 21, 28 + 5 + 5 * 21,
                PlaceType.SHOP, Area.QUADRANT_TOP_RIGHT, 36));

        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(474 + 200 + i * 21, 28 + 5 + 200 + j * 21,
                        PlaceType.HOME, Area.QUADRANT_TOP_RIGHT));
            }
        }*/
        listOfPlaces.add(new Place(469 + 6 + 0 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 1));
        listOfPlaces.add(new Place(469 + 1 + 1 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 26));
        listOfPlaces.add(new Place(469 + 7 + 2 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 4));
        listOfPlaces.add(new Place(469 + 2 + 3 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 5));
        listOfPlaces.add(new Place(469 + 9 + 4 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 27));
        listOfPlaces.add(new Place(469 + 4 + 5 * 21, 28 + 202 + 5 + 0 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 8));
        listOfPlaces.add(new Place(469 + 6 + 0 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 2));
        listOfPlaces.add(new Place(469 + 1 + 1 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 3));
        listOfPlaces.add(new Place(469 + 7 + 2 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 6));
        listOfPlaces.add(new Place(469 + 2 + 3 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 7));
        listOfPlaces.add(new Place(469 + 9 + 4 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 9));
        listOfPlaces.add(new Place(469 + 4 + 5 * 21, 28 + 197 + 5 + 1 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 10));
        listOfPlaces.add(new Place(469 + 6 + 0 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 11));
        listOfPlaces.add(new Place(469 + 1 + 1 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 28));
        listOfPlaces.add(new Place(469 + 7 + 2 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 30));
        listOfPlaces.add(new Place(469 + 2 + 3 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 31));
        listOfPlaces.add(new Place(469 + 9 + 4 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 33));
        listOfPlaces.add(new Place(469 + 4 + 5 * 21, 28 + 205 + 5 + 2 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 14));
        listOfPlaces.add(new Place(469 + 6 + 0 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 29));
        listOfPlaces.add(new Place(469 + 1 + 1 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 12));
        listOfPlaces.add(new Place(469 + 7 +  2 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 13));
        listOfPlaces.add(new Place(469 + 2 +  3 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 32));
        listOfPlaces.add(new Place(469 + 9 +  4 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 15));
        listOfPlaces.add(new Place(469 + 4 +  5 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 34));
        listOfPlaces.add(new Place(469 + 6 +  0 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 16));
        listOfPlaces.add(new Place(469 + 1 +  1 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 35));
        listOfPlaces.add(new Place(469 + 7 +  2 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 19));
        listOfPlaces.add(new Place(469 + 2 +  3 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 20));
        listOfPlaces.add(new Place(469 + 9 +  4 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 36));
        listOfPlaces.add(new Place(469 + 4 +  5 * 21, 28 + 207 + 5 + 4 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 23));
        listOfPlaces.add(new Place(469 + 6 +  0 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 17));
        listOfPlaces.add(new Place(469 + 1 +  1 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 18));
        listOfPlaces.add(new Place(469 + 7 +  2 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 21));
        listOfPlaces.add(new Place(469 + 2 +  3 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 22));
        listOfPlaces.add(new Place(469 + 9 +  4 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 24));
        listOfPlaces.add(new Place(469 + 4 +  5 * 21, 28 + 201 + 5 + 5 * 21,
                PlaceType.HOME, Area.QUADRANT_TOP_RIGHT, 25));

        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                listOfPlaces.add(new Place(474 + i * 21, 28 + 5 + 200 + j * 21,
                        PlaceType.WORK, Area.QUADRANT_TOP_RIGHT));
            }
        }*/
        listOfPlaces.add(new Place(474 + 200 + 0 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 1));
        listOfPlaces.add(new Place(474 + 200 + 1 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 4));
        listOfPlaces.add(new Place(474 + 200 + 2 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 5));
        listOfPlaces.add(new Place(474 + 200 + 3 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 20));
        listOfPlaces.add(new Place(474 + 200 + 4 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 2));
        listOfPlaces.add(new Place(474 + 200 + 5 * 21, 28 + 200 + 5 + 0 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 13));
        listOfPlaces.add(new Place(474 + 200 + 0 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 8));
        listOfPlaces.add(new Place(474 + 200 + 1 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 15));
        listOfPlaces.add(new Place(474 + 200 + 2 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 23));
        listOfPlaces.add(new Place(474 + 200 + 3 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 26));
        listOfPlaces.add(new Place(474 + 200 + 4 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 24));
        listOfPlaces.add(new Place(474 + 200 + 5 * 21, 28 + 200 + 5 + 1 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 14));
        listOfPlaces.add(new Place(474 + 200 + 0 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 16));
        listOfPlaces.add(new Place(474 + 200 + 1 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 19));
        listOfPlaces.add(new Place(474 + 200 + 2 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 3));
        listOfPlaces.add(new Place(474 + 200 + 3 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 6));
        listOfPlaces.add(new Place(474 + 200 + 4 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 21));
        listOfPlaces.add(new Place(474 + 200 + 5 * 21, 28 + 200 + 5 + 2 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 9));
        listOfPlaces.add(new Place(474 + 200 + 0 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 12));
        listOfPlaces.add(new Place(474 + 200 + 1 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 18));
        listOfPlaces.add(new Place(474 + 200 + 2 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 27));
        listOfPlaces.add(new Place(474 + 200 + 3 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 28));
        listOfPlaces.add(new Place(474 + 200 + 4 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 29));
        listOfPlaces.add(new Place(474 + 200 + 5 * 21, 28 + 200 + 5 + 3 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 30));
        listOfPlaces.add(new Place(474 + 200 + 0 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 7));
        listOfPlaces.add(new Place(474 + 200 + 1 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 11));
        listOfPlaces.add(new Place(474 + 200 + 2 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 22));
        listOfPlaces.add(new Place(474 + 200 + 3 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 10));
        listOfPlaces.add(new Place(474 + 200 + 4 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 25));
        listOfPlaces.add(new Place(474 + 200 + 5 * 21, 28 + 200 + 5 + 4 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 31));
        listOfPlaces.add(new Place(474 + 200 + 0 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 17));
        listOfPlaces.add(new Place(474 + 200 + 1 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 32));
        listOfPlaces.add(new Place(474 + 200 + 2 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 33));
        listOfPlaces.add(new Place(474 + 200 + 3 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 34));
        listOfPlaces.add(new Place(474 + 200 + 4 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 35));
        listOfPlaces.add(new Place(474 + 200 + 5 * 21, 28 + 200 + 5 + 5 * 21,
                PlaceType.WORK, Area.QUADRANT_TOP_RIGHT, 36));
    }
}
