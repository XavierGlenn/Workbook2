package org.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String fullName;
        System.out.println("Please enter your name");
        fullName = scan.nextLine();
        String[] split = fullName.split(" ");
        String firstName = split[0];
        String lastName = split[1];
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);

        String middleName = "";
        int dashPosition = fullName.trim().indexOf(middleName);
        firstName = fullName.substring(0, dashPosition);
        lastName = fullName.trim().substring(dashPosition);

        System.out.println(firstName.trim());
        System.out.println(middleName.trim());
        System.out.println(lastName.trim());
    }
}
