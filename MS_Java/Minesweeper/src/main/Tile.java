package main;

public class Tile {
    private final boolean hasBomb;
    private final boolean hasFlag;
    private final int x_coord;
    private final int y_coord;

    public Tile(boolean hasBomb, boolean hasFlag, int x_coord, int y_coord) {
        this.hasBomb = hasBomb;
        this.hasFlag = hasFlag;
        this.x_coord = x_coord;
        this.y_coord = y_coord;
    }

    


}
