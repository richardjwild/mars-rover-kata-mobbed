package com.marsmission;

public class TransmissionParser {

    public Transmission parse(String input) {
        Transmission transmission = new Transmission();
        String[] lines = input.split("\n", -1);

        Coordinate coordinate = getCoordinates(lines, 1);
        transmission.roverDefinitions.add(new RoverDefinition(coordinate));

        if (lines.length > 3) {
            Coordinate secondRoverCoordinates = getCoordinates(lines, 3);
            transmission.roverDefinitions.add(
                new RoverDefinition(secondRoverCoordinates));
        }

        return transmission;
    }

    public Coordinate getCoordinates(String[] lines, int roverInputLine) {
        String coordinates = lines[roverInputLine].substring(0, 4);
        String[] rawCoordinates = coordinates.split(" ");
        int x = Integer.parseInt(rawCoordinates[0]);
        int y = Integer.parseInt(rawCoordinates[1]);
        return new Coordinate(x, y);
    }
}
