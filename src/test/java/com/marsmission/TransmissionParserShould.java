package com.marsmission;

import org.junit.Test;

import java.util.Arrays;

import static com.marsmission.Instruction.TURN_LEFT;
import static org.junit.Assert.assertEquals;

public class TransmissionParserShould {

    @Test public void
    parse_coordinates_for_multiple_rovers() {
        TransmissionParser parser = new TransmissionParser();

        Transmission transmission =
            parser.parse("5 5\n1 1 N\n\n2 2 N\n\n3 3 N");

        assertEquals(new Coordinate(1, 1),
            transmission.getCoordinate(0));
        assertEquals(new Coordinate(2, 2),
            transmission.getCoordinate(1));
        assertEquals(new Coordinate(3, 3),
            transmission.getCoordinate(2));
    }

    @Test public void
    parse_instructions_for_multiple_rovers() {
        TransmissionParser parser = new TransmissionParser();

        Transmission transmission = parser.parse(
            "5 5\n1 1 N\nL\n2 2 N\nR\n3 3 N\nM");

        assertEquals(Arrays.asList(TURN_LEFT),
            transmission.getInstructions(0));
        assertEquals(Arrays.asList(Instruction.TURN_RIGHT),
            transmission.getInstructions(1));
        assertEquals(Arrays.asList(Instruction.MOVE),
            transmission.getInstructions(2));
    }
}
