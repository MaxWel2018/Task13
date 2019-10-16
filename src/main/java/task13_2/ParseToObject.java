package task13_2;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import task13_1.Readear;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParseToObject {
    private static final Logger LOGGER = Logger.getLogger(ParseToObject.class);

    public  static User parse() {
        User user = new User();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/task13_2/User.json"))) {
            user = new Gson().fromJson(reader, User.class);

        } catch (IOException ex) {
            LOGGER.warn(ex.getMessage());
        }
        return user;
    }


}
