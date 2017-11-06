package com.marsmission.acceptance;

import com.marsmission.MarsMission;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsMissionShould {

    @Test public void
    execute_instructions_and_give_back_rover_position() {
        MarsMission mission = new MarsMission();
        String transmission = "" +
            "5 5\n" +
            "1 2 N\n" +
            "LMLMLMLMM\n" +
            "3 3 E\n" +
            "MMRMMRMRRM";

        String actualRoverPositions = mission.execute(transmission);
        assertEquals("1 3 N\n5 1 E", actualRoverPositions);
    }
}
