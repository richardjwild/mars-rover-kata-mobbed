package com.marsmission;

public class MarsMission {
    public String execute(String transmission) {
        String[] tokens = transmission.split("\n", -1);

        String positions = "";
        for (int i = 1; i < tokens.length; i += 2) {
            if (hasInstructions(tokens, i))
                positions += getBearingAndPosition(tokens, i) + "\n";
            else
                positions += tokens[i] + "\n";
        }
        return positions.trim();
    }

    private boolean hasInstructions(String[] tokens, int roverInputLine) {
        return tokens.length > roverInputLine + 1 && !tokens[roverInputLine + 1].isEmpty();
    }

    private String getBearingAndPosition(String[] tokens, int roverInputLine) {
        return getInitialCoordinates(tokens, roverInputLine) + turn(tokens[roverInputLine + 1]);
    }

    private String getInitialCoordinates(String[] tokens, int roverInputLine) {
        return tokens[roverInputLine].substring(0, 4);
    }

    private String turn(String token) {
        if (token.equals("L"))
            return "W";
        return "E";
    }

}
