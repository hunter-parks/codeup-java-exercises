
import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"brave","eager","delightful","kind","gentle","happy","polite","faithful","witty","zealous"};
        String[] nouns = {"house","cat","dog","country","city","state","guitar","weights","birds","lizards"};

        Random r = new Random();
        int randomAdjective = r.nextInt(adjectives.length);
        System.out.println(adjectives[randomAdjective]);

        Random random = new Random();
        int randomNouns = random.nextInt(nouns.length);
        System.out.println(nouns[randomNouns]);

        System.out.println();

       System.out.println("Here is your server name: " + randomAdjective + "-" + randomNouns);

    }
}
