package task13_1;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Readear {
    private static final Logger LOGGER = Logger.getLogger(Readear.class);

    public static HashMap<Character, Integer> methodMerge(File file) {
        if (file == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        try (FileReader reader = new FileReader(file)) {
            HashMap<Character, Integer> map = new HashMap<>();
            ArrayList<Character> chars = new ArrayList<>();
            int c;
            while ((c = reader.read()) != -1) {
                chars.add((char) c);
            }
            for (char aChar : chars) {
                map.merge(aChar, 1, (oldCounter, counter) -> ++oldCounter);
            }
            return map;
        } catch (IOException ex) {
            LOGGER.warn(ex.getMessage());

        }
        throw new IllegalArgumentException();
    }
}
