package com.marsmission;

public class TransmissionParser {

    public Transmission parse(String input) {
        Transmission transmission = new Transmission();
        String[] lines = input.split("\n", -1);

        String coordinates = lines[1].substring(0, 4);
        String[] rawCoordinates = coordinates.split(" ");
        int x = Integer.parseInt(rawCoordinates[0]);
        int y = Integer.parseInt(rawCoordinates[1]);

        transmission.roverDefinitions.add(new RoverDefinition(new Coordinate(x,y)));

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
