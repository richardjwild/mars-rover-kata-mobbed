package com.marsmission;

public class MarsMission {

    private final TransmissionParser parser = new TransmissionParser();
    private Transmission transmission;

    public String execute(String input) {
        String[] lines = input.split("\n", -1);
        transmission = parser.parse(input);

        String positions = "";
        for (int i = 1; i < lines.length; i += 2) {
            positions += executeRoverInstructions(lines, i);
        }
        return positions.trim();
    }

    private String executeRoverInstructions(String[] lines, int roverInputLine) {
        if (hasInstructions(lines, roverInputLine))
            return getBearingAndPosition(lines, roverInputLine) + "\n";
        return lines[roverInputLine] + "\n";
    }

    private boolean hasInstructions(String[] lines, int roverInputLine) {
        return lines.length > roverInputLine + 1 && !lines[roverInputLine + 1].isEmpty();
    }

    private String getBearingAndPosition(String[] lines, int roverInputLine) {
        return transmission.getCoordinate((roverInputLine - 1) / 2) + " "
            + turn(lines[roverInputLine + 1]);
    }

    private String turn(String line) {
        if (line.equals("L"))
            return "W";
        return "E";
    }

}
