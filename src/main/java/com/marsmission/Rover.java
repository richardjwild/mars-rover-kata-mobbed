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
                case TURN_LEFT:
                    return new MarsVector(initialVector.coordinate, turnLeft());
                default:
                    return new MarsVector(move(), initialVector.bearing);
            }
        }
        return null;
    }

    private Coordinate move() {
        Coordinate coordinate = initialVector.coordinate;
        switch (initialVector.bearing) {
            case NORTH:
                return new Coordinate(coordinate.x, coordinate.y + 1);
            case EAST:
                return new Coordinate(coordinate.x + 1, coordinate.y);
            case SOUTH:
                return new Coordinate(coordinate.x, coordinate.y - 1);
            default:
                return new Coordinate(coordinate.x -1 , coordinate.y);
        }
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

    private Bearing turnLeft() {
        switch (initialVector.bearing) {
            case NORTH:
                return Bearing.WEST;
            case WEST:
                return Bearing.SOUTH;
            case SOUTH:
                return Bearing.EAST;
            default:
                return Bearing.NORTH;
        }
    }
}
