package com.marsmission;

public class MarsMission {
    public String execute(String transmission) {
        String[] tokens = transmission.split("\n", -1);

        if (tokens.length > 4 && !tokens[2].isEmpty() && !tokens[4].isEmpty()) {
            return "" +
                tokens[1].substring(0, 4) + turn(tokens[2]) + "\n" +
                tokens[3].substring(0, 4) + turn(tokens[4]);
        }
        if (tokens.length > 2 && !tokens[2].isEmpty())
            return tokens[1].substring(0, 4) + turn(tokens[2]);

        String positions = "";
        for (int i = 1; i < tokens.length; i += 2) {
            positions += tokens[i] + "\n";
        }
        return positions.trim();
    }

    private String turn(String token) {
        if (token.equals("L"))
            return "W";
        return "E";
    }

}
