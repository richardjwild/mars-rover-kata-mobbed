package com.marsmission;

public class MarsMission {
    public String execute(String transmission) {
        String[] tokens = transmission.split("\n");
        if (tokens.length <= 2) {
            return tokens[1];
        }
        return tokens[1] + "\n" + tokens[3];
    }
}
