package com.marsmission;

import java.util.ArrayList;
import java.util.List;

import static com.marsmission.Bearing.NORTH;

public class Transmission {
    public List<RoverDefinition> roverDefinitions = new ArrayList<>();

    Coordinate getCoordinate(int rover) {
        return roverDefinitions.get(rover).coordinate;
    }

    public List<Instruction> getInstructions(int rover) {
        return roverDefinitions.get(rover).instructions;
    }

    public Bearing getBearing(int rover) {
        return roverDefinitions.get(rover).bearing;
    }
}
