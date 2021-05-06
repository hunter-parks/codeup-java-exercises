import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. Meet Bob. He is a lackadaisical teen who responds with \n short answers and doesn't seem to care. I hope your conversation \n goes swimmingly");
        System.out.println();
        System.out.println("Please enter ?'s, yelling, and/or nothing here!");
        System.out.println();

        while (true) {
            String bobsAnswers = scanner.nextLine();
            if (bobsAnswers.endsWith("?")) {
                System.out.println("Sure dude!");
            } else if ( bobsAnswers.endsWith("!")) {
                System.out.println("Whoa man, chill out!");
            } else if (bobsAnswers.endsWith(" ")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever maaannn!");
            }
        }
    }
}
