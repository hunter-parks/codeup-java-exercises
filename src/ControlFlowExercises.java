import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // While Loop
//        int i = 5;
//        while (i <= 15){
//            System.out.println("i is: " + i);
//            i++;
//        }

        // Do-While Loop
        // Counting by 2's
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

        // Counting down by 5's
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

        // Start from 2 and SQUARE number
//        double i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

        // For Loops
        // Counts up by 1 to 15
//        for ( int i = 0; i <= 15; i++){
//            System.out.println("i is: " + i);
//        }

//        // Increments by 2
//        for (int i = 0; i <= 100; i += 2){
//            System.out.println("i is: " + i);
//        }

//        // Count down by 5's
//        for (int i = 100; i >=-10; i -= 5 ) {
//            System.out.println("i is: " + i);
//        }

        // SQUARING number
        for (double i = 2; i <= 1000000; i *= i) {
            System.out.println("i is: " + i);
        }

        // Fizz Buzz Question
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.printf("FizzBuzz\t");
            } else if ((i % 3 == 0)) {
                System.out.printf("Fizz\t");
            } else if ((i % 5 == 0)) {
                System.out.printf("Buzz\t");
            } else {
                System.out.printf("%d\t", i);
            }
        }

        //  Powers Table
        // A do-while loop to run through all user inputed integers and show them squared and cubed
//        Scanner scanner = new Scanner(System.in);
//        String userChoice = "yes";
//
//        do {
//            // Gets the input from the user
//            System.out.print("\n What number would you like to go up to? ");
//            int integer = scanner.nextInt();
//            System.out.println("Here's your table!");
//
//            // Creates a header for Number, Square, Cubed
//            String header = "number | " + "squared | " + "cubed   " + "\n"
//                    + "------  " + "------ " + "   ------   ";
//            System.out.println(header);
//
//            int square = 0;
//            int cube = 0;
//
//            String row = "";
//            for (int i = 1; i <= integer; i++) {
//
//                square = i * i;
//                cube = i * i * i;
//
//                row = i + "      | " + square + "      | " + cube;
//                System.out.println(row);
//            }
//
//            // Does the user want to continue, if so run this
//            System.out.print("Continue? (yes/no): ");
//            userChoice = scanner.next();
//            System.out.println();
//
//        }
//        while (!userChoice.equalsIgnoreCase("n"));


        // The Number grade to Letter grade Exercise

        Scanner scanner = new Scanner(System.in);
        String userInput = "yes";
        System.out.println("\n Please enter a a number grade");

        int grade = scanner.nextInt();

        do {
            if (grade <= 100 && grade >= 88) {
                System.out.println("Congrats, You got an A!");
            } else if (grade <= 87 && grade >= 80) {
                System.out.println("Nice Work! You got a B!");
            } else if (grade <= 79 && grade >= 67) {
                System.out.println("Keep it up! You got a C!");
            } else if (grade <= 66 && grade >= 60) {
                System.out.println("Almost there! You got a D!");
            } else if (grade < 59) {
                System.out.println("Keep pushing! Unfortunately you're failing!");
            } else {
                System.out.println("Invalid number! Please enter number 0-100! ");
            }
                // Asking if user wants to continue
                System.out.println("Do you wish to enter another grade? (yes/no):");
                userInput = scanner.next();
                System.out.println();

        } while (!userInput.equalsIgnoreCase("n"));
    }
}

