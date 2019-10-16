package task13_1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/java/task13_1/text.txt");
        HashMap<Character, Integer> characterIntegerHashMap = Readear.methodMerge(file);

        for (Map.Entry<Character, Integer> characterIntegerEntry : characterIntegerHashMap.entrySet()) {
            System.out.println(characterIntegerEntry.getKey() + " - " + characterIntegerEntry.getValue());
        }
    }


}
