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
}
