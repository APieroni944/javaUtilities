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
            return inputInteger(prompt, maxBound, minBound);
        }
    } public static double inputDouble(String prompt) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("An error occurred " + e + ". Please ensure you enter a valid number");
            return inputDouble(prompt);
        }
    }
    public static double inputDouble(String prompt, double maxBound, double minBound) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            double input =  Double.parseDouble(scanner.nextLine());
            if (input <= maxBound && input >= minBound) {
                return input;
            } else {
                throw new IllegalArgumentException("Input out of bounds");
            }
        } catch (Exception e) {
            System.out.println("An error occurred " + e + ". Please ensure you enter a valid number");
            return inputDouble(prompt, maxBound, minBound);
        }
    } public static float inputFloat(String prompt) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            return Float.parseFloat(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("An error occurred " + e + ". Please ensure you enter a valid number");
            return inputFloat(prompt);
        }
    }
    public static float inputFloat(String prompt, float maxBound, float minBound) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            float input =  Float.parseFloat(scanner.nextLine());
            if (input <= maxBound && input >= minBound) {
                return input;
            } else {
                throw new IllegalArgumentException("Input out of bounds");
            }
        } catch (Exception e) {
            System.out.println("An error occurred " + e + ". Please ensure you enter a valid number");
            return inputFloat(prompt, maxBound, minBound);
        }
    }
    public boolean inputBoolean(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        switch (scanner.nextLine()
                .strip()
                .toLowerCase()) {
            case "y": {
                return true;
            }
            case "n": {
                return false;
            }
            default:{
                System.out.println("Invalid option entered. Please ensure you enter either 'y' or 'n'");
                return inputBoolean(prompt);
            }
        }
    }
    public static int testable() {
        return 1;
    }
}
