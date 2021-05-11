package util;

import java.util.Scanner;


public class Input {
    private static Scanner scanner = new Scanner(System.in);

    // THE INSTANCE METHOD
    public static String getString() {
        System.out.println("Please give me a string!");
        String string = scanner.nextLine();
        System.out.println(string);
        return string;
    }

    // THE YES/NO METHOD
    public static boolean yesAndNo(){
        System.out.println("\n Do you wish to continue?");
        String userInput = scanner.next();
        if (userInput.startsWith("yes")){
            return true;
        } else {
            return false;
        }
    }

    // THE getINT METHOD
    public static int getInt(int min, int max) {
        min = 1;
        max = 8;
        int userGuess;
        do {
            System.out.println("Please give me a number between " + min + " and " + max);
            userGuess = scanner.nextInt();
        } while (userGuess > max | userGuess < min);
        System.out.println("Thank you for your input!");
        return userGuess;
    }

//    public static int getInt() {
//        int userInput = scanner.nextInt();
//        return userInput;

        // REFACTOR OF getInt METHOD
        public static int getInt() {
        scanner = new Scanner(System.in);
        String intString = getString();
        int input = Integer.valueOf(intString);
        return input;
    }

    // THE getDOUBLE METHOD
    public static double getDouble(double min, double max) {
        System.out.println("Please give me a decimal number between " + min + " and " + max);
        double guessingTheDouble;

        do {
             guessingTheDouble = getDouble();
        } while (guessingTheDouble > max | guessingTheDouble < min);
        System.out.println("Thank you for your input!");
        return guessingTheDouble;
    }

    // REFACTOR OF getDouble METHOD
    public static double getDouble() {
        scanner = new Scanner(System.in);
        String intDouble = getString();
        double doubleInput = Double.valueOf(intDouble);
        return doubleInput;
    }

}
