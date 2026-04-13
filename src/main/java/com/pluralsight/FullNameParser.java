package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String input;
        String[] parts;


        while (true) {

            System.out.print("Please enter your name: ");
            input = keyboard.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("No name was entered. Please try again. ^_^\n");
                continue;
            }

            parts = input.split("\\s+");

            if (parts.length < 2) {
                System.out.println(
                        "Only one name entered. T_T\nPlease enter either 'first last' or 'first middle last'.\n");
            }
            else if (parts.length > 3) {
                System.out.println(
                        "Too many names entered. T.T\nPlease enter either 'first last' or 'first middle last'.\n");
            }
            else {
                break;
            }
        }

        String firstName;
        String middleName;
        String lastName;

        if (parts.length == 2) {
            firstName  = normalize(parts[0]);
            middleName = "none";
            lastName   = normalize(parts[1]);
        }
        else { // parts.length == 3
            firstName  = normalize(parts[0]);
            middleName = normalize(parts[1]);
            lastName   = normalize(parts[2]);
        }

        System.out.println("First name: "  + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: "   + lastName);

        keyboard.close();
    }

    public static String normalize(String text) {
        text = text.toLowerCase();
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
