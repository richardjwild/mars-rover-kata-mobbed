package com.marsmission;

import java.util.List;

public class Rover {
    private final MarsVector initialVector;
    private final List<Instruction> instructions;

    public Rover(MarsVector initialVector, List<Instruction> instructions) {
        this.initialVector = initialVector;
        this.instructions = instructions;
    }

    public MarsVector execute() {
        return new MarsVector(initialVector.coordinate, Bearing.EAST);
    }
}
