package org.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;
public class HSHighScore {
    public void main() {
        Scanner reader = new Scanner(System.in);

//Declare variables
        int Home = 21;
        int Visitor = 9;

//Inputs
        System.out.println("Please enter Home end score: ");
        String scoreForHome = reader.nextLine();

        System.out.println("Please enter Visitor end score: ");
        String scoreForVisitor = reader.nextLine();

// Calculation (Algoritme)
//   Split the code using the Pipe (Pattern)
        String[] scoreForHomeSplit = scoreForHome.split(Pattern.quote("|"));
        String[] scoreForVisitorSplit = scoreForHome.split(Pattern.quote("|"));

//   Split the code using the Pipe (Pattern)
        System.out.println(scoreForVisitorSplit[0]);
        System.out.println(scoreForVisitorSplit[1]);
        System.out.println(scoreForHomeSplit[0]);
        System.out.println(scoreForHomeSplit[1]);

// Output
        String winner = "";
        System.out.println("Winner: " + winner);
    }
}