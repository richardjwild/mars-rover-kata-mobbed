package com.marsmission;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

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
}
