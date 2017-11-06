package com.marsmission;

public enum Bearing {
    NORTH, EAST;

    public static Bearing fromText(char c) {
        switch (c) {
            case 'N':
                return NORTH;
            default:
                return EAST;
        }
    }
}
