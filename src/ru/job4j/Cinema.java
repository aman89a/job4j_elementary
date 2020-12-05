package ru.job4j;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                if (i == j) {
                    if (places[i][j] == null) {
                        return new Place(i, j);
                    }
                }
            }
        }
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                if (i == places[i].length - j) {
                    if (places[i][places[i].length - j] == null) {
                        return new Place(i, places[i].length - j);
                    }
                }
            }
        }
        return null;
    }

    public static class Place {
        private int row;
        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }

    public static void main(String[] args) {
        Place[][] places = {
                {null, null, new Place(0, 2)},
                {null, new Place(1, 1), new Place(1, 2)},
                {new Place(2, 0), new Place(2, 1), new Place(2, 2)}
        };
        System.out.println(checkEmptyPlace(places));
    }
}
