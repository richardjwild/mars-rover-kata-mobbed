package com.marsmission;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RoverShould {

    @Test public void
    turn_left() {
        List<Instruction> instructions = Arrays.asList(Instruction.TURN_LEFT);
        MarsVector initialVector = new MarsVector(
            new Coordinate(1, 1), Bearing.NORTH);
        Rover rover = new Rover(initialVector, instructions);

        assertEquals(
            new MarsVector(new Coordinate(1, 1), Bearing.EAST),
            rover.execute());

    }
}
