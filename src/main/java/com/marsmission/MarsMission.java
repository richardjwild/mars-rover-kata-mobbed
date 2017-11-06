package com.marsmission;

import java.util.List;

public class MarsMission {
    private final TransmissionParser parser = new TransmissionParser();

    public String execute(String input) {
        Transmission transmission = parser.parse(input);

        String positions = "";
        for (int i = 0; i < transmission.roverCount(); i++) {
            positions += "" +
                transmission.getCoordinate(i) +
                " " +
                turn(transmission.getInstructions(i), transmission.getBearing(i)) +
                "\n";
        }
        return positions.trim();
    }

    private String turn(List<Instruction> instructions, Bearing bearing) {
        if (instructions.isEmpty())
            return bearing.toString();
        if (instructions.get(0).equals(Instruction.TURN_LEFT))
            return "W";
        return "E";
    }
}
