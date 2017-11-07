package com.marsmission;

import java.util.ArrayList;
import java.util.List;

public class TransmissionParser {

    public Transmission parse(String input) {
        Transmission transmission = new Transmission();
        String[] lines = input.split("\n", -1);

        for (int i = 1; i < lines.length; i += 2) {
            Coordinate coordinate = parseCordinates(lines, i);
            List<Instruction> instructions = parseInstruction(lines, i);
            Bearing bearing = Bearing.fromText(lines[i].charAt(4));
            transmission.addRover(
                new RoverDefinition(coordinate, instructions, bearing));
        }

        return transmission;
    }

    private Coordinate parseCordinates(String[] lines, int roverInputLine) {
        String coordinates = lines[roverInputLine].substring(0, 4);
        String[] rawCoordinates = coordinates.split(" ");
        int x = Integer.parseInt(rawCoordinates[0]);
        int y = Integer.parseInt(rawCoordinates[1]);
        return new Coordinate(x, y);
    }

    private List<Instruction> parseInstruction(String[] lines, int roverInputLine) {
        List<Instruction> instructions = new ArrayList<>();
        for (char instruction : lines[roverInputLine + 1].toCharArray()) {
            instructions.add(Instruction.fromText(instruction));
        }
        return instructions;
    }
}
