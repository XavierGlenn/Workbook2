package org.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {

        System.out.print(" Enter 'add' or 'subtract' or 'divide' or 'multiply': ");
        String action = scan.nextLine();

        String fullName;
        System.out.println("Please enter your name");
        fullName = scan.nextLine();
        String[] split = fullName.split(" ");
        String firstName = split[0];
        String lastName = split[1];
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }
}
