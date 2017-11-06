package com.marsmission;

import java.util.ArrayList;
import java.util.List;

import static com.marsmission.Instruction.TURN_LEFT;

public class Transmission {
    public List<RoverDefinition> roverDefinitions = new ArrayList<>();

    Coordinate getCoordinate(int rover) {
        return roverDefinitions.get(rover).coordinate;
    }

    public Instruction getInstruction(int rover) {
        return TURN_LEFT;
    }
}
