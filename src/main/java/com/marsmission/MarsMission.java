package com.marsmission;

import java.util.List;

import static com.marsmission.Bearing.EAST;
import static com.marsmission.Bearing.WEST;
import static com.marsmission.Instruction.TURN_LEFT;

public class MarsMission {
    private final TransmissionParser parser = new TransmissionParser();

    public String execute(String input) {
        Transmission transmission = parser.parse(input);

        String positions = "";
        for (int i = 0; i < transmission.roverCount(); i++) {
            positions += String.format("%s %s\n",
                transmission.getCoordinate(i),
                executeInstructions(transmission, i));
        }
        return positions.trim();
    }

    private String executeInstructions(Transmission transmission, int roverId) {
        List<Instruction> instructions = transmission.getInstructions(roverId);
        Bearing bearing = transmission.getBearing(roverId);
//        Rover rover = new Rover(transmission.getCoordinate(roverId), bearing, instructions);
//        MarsVector finalVector = rover.execute();

        if (instructions.isEmpty())
            return bearing.toString();
        if (instructions.get(0).equals(TURN_LEFT))
            return WEST.toString();
        return EAST.toString();
    }
}
