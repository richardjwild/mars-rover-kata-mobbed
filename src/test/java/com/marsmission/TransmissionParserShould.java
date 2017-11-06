package com.marsmission;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.marsmission.Bearing.NORTH;
import static com.marsmission.Instruction.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TransmissionParserShould {

    private final TransmissionParser parser = new TransmissionParser();

    @Test public void
    parse_coordinates_for_multiple_rovers() {
        Transmission transmission =
            parser.parse("5 5\n1 1 N\n\n2 2 N\n\n3 3 N\n");

        assertEquals(new Coordinate(1, 1),
            transmission.getCoordinate(0));
        assertEquals(new Coordinate(2, 2),
            transmission.getCoordinate(1));
        assertEquals(new Coordinate(3, 3),
            transmission.getCoordinate(2));
    }

    @Test public void
    parse_instructions_for_multiple_rovers() {
        Transmission transmission = parser.parse(
            "5 5\n1 1 N\nL\n2 2 N\nR\n3 3 N\nM");

        assertEquals(asList(TURN_LEFT),
            transmission.getInstructions(0));
        assertEquals(asList(TURN_RIGHT),
            transmission.getInstructions(1));
        assertEquals(asList(MOVE),
            transmission.getInstructions(2));
    }

    @Test public void
    parse_multiple_instructions_for_one_rover() {
        Transmission transmission = parser.parse(
            "5 5\n1 1 N\nLL");

        assertEquals(asList(TURN_LEFT, TURN_LEFT),
            transmission.getInstructions(0));
    }

    @Test
    @Parameters({
        "5 5\n1 1 N\n | NORTH"
    })
    public void
    parse_bearing_for_one_rover(String input, Bearing expectedBearing) {
        Transmission transmission = parser.parse(input);

        assertEquals(expectedBearing, transmission.getBearing(0));
    }
}
