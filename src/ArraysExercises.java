import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

                    // Array Basics
        // ONLY PRINTS STRINGS
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));


        // CREATED A NEW STRING OF 3 PEOPLE
        String[] Person = {"Jimmy Page", "Jimi Hendrix", "Eric Clapton"};

//
//        Person newGuy = new Person("Jimmy Page");
//        System.out.println("The new guy is " + newGuy);

        for (String element : Person){
            System.out.println(element);
        }


//        System.out.println(Arrays.toString(people));




    }
}
