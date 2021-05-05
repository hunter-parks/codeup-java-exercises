import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

                    // Array Basics
        // ONLY PRINTS STRINGS
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));


        // CREATED A NEW STRING OF 3 PEOPLE
        String[] Person = {"Jimmy Page", "Jimi Hendrix", "Eric Clapton"};

        for (String element : Person){
            System.out.println(element);
        }

        Person newGuy = new Person("Flea");
        System.out.println("The new guy is " + newGuy);





    }
}
