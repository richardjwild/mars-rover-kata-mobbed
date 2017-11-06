package com.marsmission;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsMissionShould {

    @Test public void
    report_rover_initial_position_when_no_instructions_are_provided() {
        MarsMission mission = new MarsMission();
        String transmission = "5 5\n1 1 N\n";

        String actualRoverPosition = mission.execute(transmission);

        assertEquals("1 1 N", actualRoverPosition);
    }
}
