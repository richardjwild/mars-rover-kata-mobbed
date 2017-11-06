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
        "5 5\n1 1 N\n | 1 1 N",
        "5 5\n3 3 N\n | 3 3 N"
    })
    public void
    report_rover_initial_position_when_no_instructions_are_provided(
        String transmission, String expectedRoverPosition) {
        MarsMission mission = new MarsMission();

        String actualRoverPosition = mission.execute(transmission);

        assertEquals(expectedRoverPosition, actualRoverPosition);
    }

    @Test
    @Parameters({
        "5 5\n1 1 N\n\n2 2 N\n | 1 1 N\n2 2 N"
    })
    public void
    report_rovers_initial_position_when_no_instructions_are_provided(
        String transmission, String expectedRoversPosition) {
        MarsMission mission = new MarsMission();

        String actualRoverPosition = mission.execute(transmission);

        assertEquals(expectedRoversPosition, actualRoverPosition);
    }
}
