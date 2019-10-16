package task13_3;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import task13_2.User;

import java.io.*;

public class ObjectToJson {
    private static final Logger LOGGER = Logger.getLogger(ObjectToJson.class);
    public  static void writeToJsonFile(User user) {
        try (BufferedWriter reader = new BufferedWriter(new FileWriter("src/main/java/task13_3/user.json"))) {

            reader.write(new Gson().toJson(user));

        } catch (IOException ex) {
            LOGGER.warn(ex.getMessage());
        }
    }
}
