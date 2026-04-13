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
    }
}
