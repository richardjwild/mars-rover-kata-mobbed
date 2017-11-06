package com.marsmission;

public class MarsMission {
    public String execute(String transmission) {
        String[] tokens = transmission.split("\n");
        String positions = "";
        for (int i = 1; i < tokens.length; i += 2) {
            positions += tokens[i] + "\n";
        }
        return positions.trim();
    }
}
