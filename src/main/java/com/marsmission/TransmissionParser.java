package com.marsmission;

public class TransmissionParser {

    public Transmission parse(String input) {
        Transmission transmission = new Transmission();
        String[] lines = input.split("\n", -1);

        for (int i = 1; i < lines.length; i += 2) {
            Coordinate coordinate = getCoordinates(lines, i);
            transmission.roverDefinitions.add(new RoverDefinition(coordinate));
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
