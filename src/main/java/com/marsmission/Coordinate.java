package com.marsmission;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public String toString() {
        return String.format("%d %d", x, y);
    }
}