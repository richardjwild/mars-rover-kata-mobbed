package com.marsmission;

import java.util.ArrayList;
import java.util.List;

public class Transmission {
    private List<RoverDefinition> roverDefinitions = new ArrayList<>();

    Coordinate getCoordinate(int rover) {
        return roverDefinitions.get(rover).coordinate;
    }

    public List<Instruction> getInstructions(int rover) {
        return roverDefinitions.get(rover).instructions;
    }

    public Bearing getBearing(int rover) {
        return roverDefinitions.get(rover).bearing;
    }

    public void addRover(RoverDefinition roverDefinition) {
        roverDefinitions.add(roverDefinition);
    }

    public int roverCount() {
        return roverDefinitions.size();
    }
}
