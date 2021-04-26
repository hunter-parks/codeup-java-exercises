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
        // Wrote a for loop and just printed the questions before looping
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n How many numbers do you want to see? ");
        int userInt = scanner.nextInt();
        System.out.println("Number | Squared | Cubed");

        // Looping through numbers and squaring and cubing
        for (int i = 1; i <= userInt; i++){
            System.out.println(i + "        " + (i * i) + "         " + "  " +(i * i * i));
        }

    }
}

