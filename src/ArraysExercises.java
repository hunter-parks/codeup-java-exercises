import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

                    // Array Basics
        // ONLY PRINTS STRINGS
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        // GOT FROM THE PERSON CLASS, AND ADDED A LENGTH OF 3
        Person[] people = new Person[3];

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println(Arrays.toString(people));




    }
}
