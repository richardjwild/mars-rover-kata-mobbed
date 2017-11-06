package com.marsmission;

import java.util.Arrays;

public enum Bearing {
    NORTH, EAST, WEST, SOUTH;

    public static Bearing fromText(char c) {
        return Arrays.stream(values())
            .filter(value -> value.name().charAt(0) == c)
            .findAny().get();
    }
}
