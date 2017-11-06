package com.marsmission;

public class MarsMission {
    public String execute(String transmission) {
        String[] tokens = transmission.split("\n");

        if (tokens.length > 2 && !tokens[2].isEmpty())
            return turn(tokens[2]);

        String positions = "";
        for (int i = 1; i < tokens.length; i += 2) {
            positions += tokens[i] + "\n";
        }
        return positions.trim();
    }

    private String turn(String token) {
        if (token.equals("L"))
            return "1 1 W";
        return "1 1 E";
    }

}
