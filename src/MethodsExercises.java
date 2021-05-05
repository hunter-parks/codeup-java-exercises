import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.print(returnNum1PlusNum2(2,3)); // ADD
//        System.out.println(returnNum1MinusNum2(10,5)); //SUBTRACT
//        System.out.println(Num1TimesNum2(3,3)); // MULTIPLY
        System.out.println(Num1DividedByNum2(100, 50)); // DIVIDE
//        System.out.println(getInteger(1,10));


    }

    // ADDITION
    public static double returnNum1PlusNum2(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    // SUBTRACTION
    public static double returnNum1MinusNum2(double num1, double num2) {
        double endResult = num1 - num2;
        return endResult;
    }

    // MULTIPLICATION
    public static double Num1TimesNum2(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    // DIVISION
    public static double Num1DividedByNum2(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }


    // ASK FOR USER INPUT TO BE IN A CERTAIN RANGE
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Please enter a number");
//        int input = scanner.nextInt();
//        if (input > max || input < min) {
//            System.out.printf("Invalid number! Enter a number between %s to %s:", min, max);
//            return getInteger(min, max);
//        }
//        System.out.println("You entered " );
//        return input;
//
//    }

     //FACTORIAL PROBLEM





    // DICE ROLL
    public static void diceRoll() {
        String response;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("You are rolling a pair of dice, how many sides do both dies have?");
            int sides = sc.nextInt();
            int die1 = (int) (Math.random() * (sides - 1) + 1);
            int die2 = (int) (Math.random() * (sides - 1) + 1);
            System.out.println(die1 + "  " + die2);
            int result = die1 + die2;
            System.out.println("You rolled a " + result + "!");

            System.out.println("Re-roll?  [Y/N]");
            response = sc.next();
        } while (response.equalsIgnoreCase("Y"));
    }

}

