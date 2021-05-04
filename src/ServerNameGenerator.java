import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"brave","eager","delightful","kind","gentle","happy","polite","faithful","witty","zealous"};
        String[] nouns = {"house","cat","dog","country","city","state","guitar","weights","birds","lizards"};
        Random randomAdjectives = new Random(adjectives.length);
        Random randomNouns = new Random(nouns.length);

        System.out.println("randomAdjectives = " + randomAdjectives);
        System.out.println("randomNouns = " + randomNouns);
    }
}
