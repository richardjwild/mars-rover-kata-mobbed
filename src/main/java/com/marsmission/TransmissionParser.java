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
            transmission.roverDefinitions.add(
                new RoverDefinition(coordinate, instructions));
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
        if (roverInputLine + 1 < lines.length) {
            String instructionsString = lines[roverInputLine + 1];
            char[] instructionsChar=instructionsString.toCharArray();
            for(char instruction: instructionsChar){
                instructions.add(Instruction.fromText(instruction));
            }
        }
        return instructions;
    }
}
