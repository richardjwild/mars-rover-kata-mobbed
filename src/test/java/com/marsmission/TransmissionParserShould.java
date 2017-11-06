package com.marsmission;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransmissionParserShould {

    @Test public void
    parse_coordinate() {
        TransmissionParser parser = new TransmissionParser();
        Transmission transmission = parser.parse("5 5\n1 1 N");
        assertEquals(new Coordinate(1, 1),
            transmission.getCoordinate(0));
    }

}
