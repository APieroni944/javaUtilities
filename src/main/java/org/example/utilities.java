package org.example;

import java.util.Scanner;

public class utilities {
    public static int inputInteger(String prompt) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("An error occurred " + e + ". Please ensure you enter a valid integer");
            return inputInteger(prompt);
        }
    }
    public static int inputInteger(String prompt, int maxBound, int minBound) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            int input =  Integer.parseInt(scanner.nextLine());
            if (input <= maxBound && input >= minBound) {
                return input;
            } else {
                throw new IllegalArgumentException("Input out of bounds");
            }
        } catch (Exception e) {
            System.out.println("An error occurred " + e + ". Please ensure you enter a valid integer");
            return inputInteger(prompt);
        }
    }
    public static int testable() {
        return 1;
    }
}
