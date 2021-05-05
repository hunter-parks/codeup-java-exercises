package oopLecture;

public class Person { // BLUEPRINT
    public String firstName;
    public String lastName;
    public String joinsChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    }

    public static long worldPop = 7_860_000_000L;


    public static void main(String[] args) { // RUNNING THE BLUEPRINT
        Person hun = new Person();
        Person april = new Person();
        Person brian = new Person();


        hun.firstName = "Hunter";
        hun.lastName = "Parks";

        april.firstName = "April";
        april.lastName = "Aranda";

        brian.firstName = "Brian";
        brian.lastName = "Parks";



        System.out.println("hun.firstName = " + hun.firstName);
        System.out.println("hun.lastName = " + hun.lastName);
        System.out.println("april.firstName = " + april.firstName);
        System.out.println("april.lastName = " + april.lastName);


        System.out.println("hun.joinsChat() = " + hun.joinsChat());
        System.out.println("april.joinsChat() = " + april.joinsChat());
        System.out.println("brian.joinsChat() = " + brian.joinsChat());

        // WORLD POPULATION + CLASS/OBJECTS FIELD
        System.out.println("worldPop = " + Person.worldPop);
        Person.worldPop += 1;// NEW PERSON WAS CREATED WE NEED TO ADJUST THE WORLDPOP!
        System.out.println("worldPop = " + Person.worldPop);

        System.out.println("brian.worldPop = " + brian.worldPop);

//        System.out.println("Person.firstName = " + Person.firstName);// THIS WILL NOT COMPILE - INSTANT ERROR AND THE JAVA PROGRAM WILL NOT CONTINUE UNTIL REFACTORED!

    }



}
