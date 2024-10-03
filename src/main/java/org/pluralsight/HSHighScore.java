package org.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;
public class HSHighScore {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        //Declaring Variables

        // Gathering inputs
        System.out.print("Please enter a score:");
        String scoreForGame = reader.nextLine(); //Home and visitor score

        // Calculation (Algoritme)
        //   Split the code using the Pipe (Pattern)
        String[] scoreSplitOnPipe = scoreForGame.split(Pattern.quote("|"));

        //   Split the code using the Pipe (Pattern)
        System.out.println(scoreSplitOnPipe[0]); // "Home:Visitor"
        System.out.println(scoreSplitOnPipe[1]); // "21:9"

        //  String[] xx = xx.split(Pattern.quote(":"));
        String team1 = "Home";
        String team2 = "Visitor";
        String teamScore = "21"; //Convert to Integer to calculate
        String teamScore2 = "9"; //Convert to Integer to calculate


        Pattern[] scoreForVisitorSplit = new Pattern[0];
        String[] homeAndScoreSplit = scoreForVisitorSplit[0].split(Pattern.quote(":"));
        System.out.println(homeAndScoreSplit[0]); //Home
        System.out.println(homeAndScoreSplit[1]); //Visitor

        //Output
        String winner = "";
        System.out.println("Winner: " + winner);
    }
}