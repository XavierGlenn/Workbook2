package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RemseysExamples {

    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {


        String myMessage = "You guys are \n amazing!\n The \"BEST GROUP EVER\"";
        System.out.println("Do you you all like the lessons? (Yes/No)");
        System.out.println("");
        String answer = reader.nextLine();
        //Comparing string
        boolean areLessonsLiked = false;
        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("So happy to hear that");
            areLessonsLiked = true;
        }
        if (!areLessonsLiked) {
            System.out.println("Please tell me how I can improve the lessons");
        }

        // System.out.println(myMessage);

        //Give someone here in the class a compliment...
        //Use there firstname in variable and make their name uppercase.

        String firstName = "Yeshua";
        System.out.println(firstName.toUpperCase() + "Having you in class cheers me up when I feel down. Thank you!");

        String test = "Programming is both an art and a science.";
        System.out.println(test.charAt(23) + " " + test.charAt(4) + " " + test.charAt(25));

        String socialSecurity = "000-00-0000";
        int dashPosition = socialSecurity.indexOf("-");
        String socialNumber = socialSecurity.substring(dashPosition + 4);
        System.out.println(socialNumber);

        String iHaveThisAmountOfMoney = "323432.435";
        double money = Double.parseDouble(iHaveThisAmountOfMoney);
        System.out.println("$" + money);

        String userInput; DateTimeFormatter formatter; userInput = "2 Mar 1996";
        formatter = DateTimeFormatter.ofPattern("d MMM yyyy") LocalDate birthDay = LocalDate.parse(userInput, formatter);
    }
}