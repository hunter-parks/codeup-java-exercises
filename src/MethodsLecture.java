public class MethodsLecture {
    public static void main(String[] args) {
        System.out.println("Hello,Method");
        // ------ DEFINING AND CALLING METHODS WITH VARIOUS INPUTS
        sayGreeting();
        sayInput("Hello, Peeps!");
        System.out.println(getGreetingWithName("Hunter"));
        System.out.println(returnProductOfThreeNumbers(1,2,3));
        System.out.println(getGreetingWithName("Greetings, ", "Hunter"));
        //countToLoop(100);
        countTo100(1);
    }

    public static void sayGreeting(){
        System.out.println(getDefaultGreeting());
    }

    public static void sayInput(String input) {
        System.out.println(input);
    }

    // RETURN OUTPUT WITHOUT ANY INPUT
    public static String getDefaultGreeting(){
        return "Hello, ";
    }

    // RETURN OUTPUT WITH INPUT
    public static String getGreetingWithName(String name) {
        return getDefaultGreeting() + " " + name;
    }

    // RETURNING OUTPUT WITH INPUT USING NUMBERS
    public static double returnProductOfThreeNumbers(double num1, double num2, double num3){
        double result = num1 * num2 * num3;
        return result;
    }

    // METHOD OVERLOADING
    public static String getGreetingWithName(String salutation,String name) {
        return salutation + name;
    }

    // RECURSION
    public static void countToLoop(int num){
        for (int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }

    public static int countTo100(int num) {
        System.out.println(num);
        if (num == 100) {
            return num;
        } else {
            return countTo100(++num);
        }
    }
}
