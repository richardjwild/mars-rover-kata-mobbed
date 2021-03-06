package com.marsmission;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MarsMissionShould {

    @Test
    @Parameters({
        "5 5\n1 1 N\n\n | 1 1 N",
        "5 5\n3 3 N\n\n | 3 3 N"
    })
    public void
    report_single_rover_initial_position_when_no_instructions_are_provided(
        String transmission, String expectedRoverPosition) {
        MarsMission mission = new MarsMission();

        String actualRoverPosition = mission.execute(transmission);

        assertEquals(expectedRoverPosition, actualRoverPosition);
    }

    @Test
    @Parameters({
        "5 5\n1 1 N\n\n2 2 N\n          | 1 1 N\n2 2 N",
        "5 5\n1 1 N\n\n2 2 N\n\n3 3 N\n | 1 1 N\n2 2 N\n3 3 N"
    })
    public void
    report_multiple_rovers_initial_position_when_no_instructions_are_provided(
        String transmission, String expectedRoversPosition) {
        MarsMission mission = new MarsMission();

        String actualRoverPosition = mission.execute(transmission);

        assertEquals(expectedRoversPosition, actualRoverPosition);
    }

    @Test
    @Parameters({
        "5 5\n1 1 N\nL | 1 1 W",
        "5 5\n1 1 N\nR | 1 1 E"
    })
    public void
    tell_single_rover_to_turn(
        String transmission, String expectedRoversPosition) {
        MarsMission mission = new MarsMission();

        String actualRoverPosition = mission.execute(transmission);

        assertEquals(expectedRoversPosition, actualRoverPosition);
    }


    @Test
    @Parameters({
        "5 5\n1 1 N\nL\n2 2 N\nL | 1 1 W\n2 2 W",
    })
    public void
    tell_multiple_rovers_to_turn(
        String transmission, String expectedRoversPosition) {
        MarsMission mission = new MarsMission();

        String actualRoverPosition = mission.execute(transmission);

        assertEquals(expectedRoversPosition, actualRoverPosition);
    }
}
