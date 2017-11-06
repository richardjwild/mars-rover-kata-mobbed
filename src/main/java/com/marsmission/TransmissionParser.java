package com.marsmission;

import java.util.ArrayList;
import java.util.List;

import static com.marsmission.Instruction.TURN_LEFT;
import static com.marsmission.Instruction.TURN_RIGHT;

public class TransmissionParser {

    public Transmission parse(String input) {
        Transmission transmission = new Transmission();
        String[] lines = input.split("\n", -1);

        for (int i = 1; i < lines.length; i += 2) {
            Coordinate coordinate = getCoordinates(lines, i);
            List<Instruction> instructions = new ArrayList<>();
            if (i + 1 < lines.length) {
                switch (lines[i + 1]) {
                    case "L":
                        instructions.add(TURN_LEFT);
                        break;
                    case "R":
                        instructions.add(TURN_RIGHT);
                        break;
                }
            }
            transmission.roverDefinitions.add(
                new RoverDefinition(coordinate, instructions));
        }

        return transmission;
    }

    private Coordinate getCoordinates(String[] lines, int roverInputLine) {
        String coordinates = lines[roverInputLine].substring(0, 4);
        String[] rawCoordinates = coordinates.split(" ");
        int x = Integer.parseInt(rawCoordinates[0]);
        int y = Integer.parseInt(rawCoordinates[1]);
        return new Coordinate(x, y);
    }
}
