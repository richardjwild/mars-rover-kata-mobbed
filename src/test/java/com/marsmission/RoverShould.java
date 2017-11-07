package com.marsmission;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static com.marsmission.Instruction.MOVE;
import static com.marsmission.Instruction.TURN_LEFT;
import static com.marsmission.Instruction.TURN_RIGHT;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RoverShould {

    @Test
    @Parameters({
        "1,1,NORTH | EAST",
        "1,1,EAST  | SOUTH",
        "1,1,SOUTH | WEST",
        "1,1,WEST  | NORTH"
    })
    public void
    turn_right(int x, int y, Bearing initialBearing, Bearing expectedBearing) {
        List<Instruction> instructions = asList(TURN_RIGHT);
        MarsVector initialVector = new MarsVector(
            new Coordinate(x, y), initialBearing);
        Rover rover = new Rover(initialVector, instructions);

        assertEquals(
            new MarsVector(new Coordinate(x, y), expectedBearing),
            rover.execute());

    }

    @Test
    @Parameters({
        "1,1,NORTH | WEST",
        "1,1,WEST  | SOUTH",
        "1,1,SOUTH | EAST",
        "1,1,EAST  | NORTH"
    })
    public void
    turn_left(int x, int y, Bearing initialBearing, Bearing expectedBearing) {
        List<Instruction> instructions = asList(TURN_LEFT);
        MarsVector initialVector = new MarsVector(
            new Coordinate(x, y), initialBearing);
        Rover rover = new Rover(initialVector, instructions);

        assertEquals(
            new MarsVector(new Coordinate(x, y), expectedBearing),
            rover.execute());

    }

    @Test
    @Parameters({
        "1,1,NORTH | 1,2",
        "1,1,EAST  | 2,1"
    })
    public void move_forwards(int x, int y, Bearing initialBearing, int expectedX, int expectedY) {
        List<Instruction> instructions = asList(MOVE);
        MarsVector initialVector = new MarsVector(
            new Coordinate(x, y), initialBearing);
        Rover rover = new Rover(initialVector, instructions);

        assertEquals(
            new MarsVector(new Coordinate(expectedX, expectedY), initialBearing),
            rover.execute());
    }
}
