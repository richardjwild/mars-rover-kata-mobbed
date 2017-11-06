package com.marsmission;

public enum Instruction {
    TURN_RIGHT, MOVE, TURN_LEFT;

    public static Instruction fromText(String text) {
        switch (text) {
            case "L":
                return TURN_LEFT;
            case "R":
                return TURN_RIGHT;
            default:
                return MOVE;
        }
    }
}
