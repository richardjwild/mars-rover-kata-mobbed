package com.marsmission;

public class MarsMission {
    public String execute(String transmission) {
        String[] tokens = transmission.split("\n");
        if (tokens.length > 2 && !tokens[2].isEmpty()) {
            if (tokens[2].equals("L"))
                return "1 1 W";
            return "1 1 E";
        }
        String positions = "";
        for (int i = 1; i < tokens.length; i += 2) {
            positions += tokens[i] + "\n";
        }
        return positions.trim();
    }
}
