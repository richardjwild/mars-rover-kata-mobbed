package com.marsmission;

import java.util.ArrayList;
import java.util.List;

public class TransmissionParser {

    public Transmission parse(String input) {
        List<RoverDefinition> roverDefinitions = new ArrayList<>();
        Transmission transmission = new Transmission();
        String[] lines = input.split("\n", -1);
        return transmission;
    }

    public Coordinate getCoordinates(String[] tokens, int roverInputLine) {
        String coordinates = tokens[roverInputLine].substring(0, 4);
        String[] rawCoordinates = coordinates.split(" ");
        int x = Integer.parseInt(rawCoordinates[0]);
        int y = Integer.parseInt(rawCoordinates[1]);
        return new Coordinate(x, y);
    }
}
