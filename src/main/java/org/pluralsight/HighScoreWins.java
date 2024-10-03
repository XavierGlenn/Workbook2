package org.pluralsight;

import java.util.regex.Pattern;

public class HighScoreWins {

    String input = "Home:Away|74:23";
    String[] tokens = input.split(Pattern.quote("|"));
    int id = Integer.parseInt(tokens[0]);
    String name = tokens[1];
    int quantity = Integer.parseInt(tokens[2]);
    double price = Double.parseDouble(tokens[3]);
    }