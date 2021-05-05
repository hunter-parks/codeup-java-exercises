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
            System.out.println("Please give me a number between " + min + "and " + max);
            userGuess = getInt();
        } while (userGuess > max | userGuess < min);
        System.out.println("Thank you for your input!");
        return userGuess;
    }

}
