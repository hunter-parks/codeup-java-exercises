public class Person {
    public static void main(String[] args) {
        Person Hunter = new Person("Hunter Parks");
        System.out.println(Hunter.getName());
        Hunter.sayHello();
        Hunter.setName("you are not Hunter");
        Hunter.sayHello();
        // COMES BACK TRUE,FALSE
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        // COMES BACK TRUE
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        // COMES BACK JOHN TWICE AND JANE TWICE
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        // TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
//TODO: change the name property to the passed value

        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name

        System.out.println("Hello, " + getName() + "!");
    }


}
