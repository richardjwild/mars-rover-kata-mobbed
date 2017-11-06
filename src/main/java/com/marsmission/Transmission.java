package com.marsmission;

import java.util.ArrayList;
import java.util.List;

public class Transmission {
    public List<RoverDefinition> roverDefinitions = new ArrayList<>();

    Coordinate getCoordinate(int rover) {
        return roverDefinitions.get(rover).coordinate;
    }

    public List<Instruction> getInstructions(int rover) {
        return roverDefinitions.get(rover).instructions;
    }

}
