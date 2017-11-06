package com.marsmission;

import java.util.List;

public class Rover {
    private final MarsVector initialVector;
    private final List<Instruction> instructions;

    public Rover(MarsVector initialVector, List<Instruction> instructions) {
        this.initialVector = initialVector;
        this.instructions = instructions;
    }

    public MarsVector execute() {
        for (Instruction instruction : instructions) {
            switch (instruction) {
                case TURN_RIGHT:
                    return new MarsVector(initialVector.coordinate, turnRight());
                default:
                    return null;
            }
        }
        return null;
    }

    private Bearing turnRight() {
        switch (initialVector.bearing) {
            case NORTH:
                return Bearing.EAST;
            case EAST:
                return Bearing.SOUTH;
            case SOUTH:
                return Bearing.WEST;
            default:
                return Bearing.NORTH;
        }
    }
}
