package com.marsmission;

import java.util.List;

public class RoverDefinition {
    public final Coordinate coordinate;
    public final List<Instruction> instructions;

    public RoverDefinition(Coordinate coordinate, List<Instruction> instructions) {
        this.coordinate = coordinate;
        this.instructions = instructions;
    }
}
