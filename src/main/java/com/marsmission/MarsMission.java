package com.marsmission;

public class MarsMission {

    private final TransmissionParser parser = new TransmissionParser();

    public String execute(String input) {
        String[] lines = input.split("\n", -1);
        Transmission transmission = parser.parse(input);

        String positions = "";
        for (int i = 1; i < lines.length; i += 2) {
            positions += executeRoverInstructions(lines, i);
        }
        return positions.trim();
    }

    private String executeRoverInstructions(String[] tokens, int roverInputLine) {
        if (hasInstructions(tokens, roverInputLine))
            return getBearingAndPosition(tokens, roverInputLine) + "\n";
        return tokens[roverInputLine] + "\n";
    }

    private boolean hasInstructions(String[] tokens, int roverInputLine) {
        return tokens.length > roverInputLine + 1 && !tokens[roverInputLine + 1].isEmpty();
    }

    private String getBearingAndPosition(String[] tokens, int roverInputLine) {
        return parser.getCoordinates(tokens, roverInputLine) + " "
            + turn(tokens[roverInputLine + 1]);
    }

    private String turn(String token) {
        if (token.equals("L"))
            return "W";
        return "E";
    }

}
