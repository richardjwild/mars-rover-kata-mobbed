package com.marsmission;

import java.util.List;

public class RoverDefinition {
    public final Coordinate coordinate;
    public final List<Instruction> instructions;
    public final Bearing bearing;

    public RoverDefinition(Coordinate coordinate, List<Instruction> instructions, Bearing bearing) {
        this.coordinate = coordinate;
        this.instructions = instructions;
        this.bearing = bearing;
    }
}
