package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String input = keyboard.nextLine()  .trim();

        if (input.isEmpty()) {
            System.out.println("No name was entered. Please restart. ^_^");
            keyboard.close();
            return;
        }

        String[] parts = input.split("\\s+");

        String firstName;
        String middleName;
        String lastName;

        if (parts.length == 2) {
            firstName  = normalize(parts[0]);
            middleName = ("none");
            lastName   = normalize(parts[1]);
        }
        else if (parts.length == 3) {
            firstName  = normalize(parts[0]);
            middleName = normalize(parts[1]);
            lastName   = normalize(parts[2]);
        }
        else if (parts.length > 3) {
            System.out.println("Too many names entered. T.T\nPlease enter either 'first last' or 'first middle last'.");
            keyboard.close();
            return;
        }
        else {
            System.out.println("Only one name entered. T_T\nPlease enter either 'first last' or 'first middle last'.");
            keyboard.close();
            return;
        }

        System.out.println("First name: "  + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: "   + lastName);

        keyboard.close();
    }
}
