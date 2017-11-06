package com.marsmission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.marsmission.Instruction.TURN_LEFT;

public class Transmission {
    public List<RoverDefinition> roverDefinitions = new ArrayList<>();

    Coordinate getCoordinate(int rover) {
        return roverDefinitions.get(rover).coordinate;
    }

    public List<Instruction> getInstructions(int rover) {
        return Arrays.asList(TURN_LEFT);
    }
}
