package task13_3;

import task13_2.ParseToObject;
import task13_2.User;

public class Main {
    public static void main(String[] args) {
        User user = ParseToObject.parse();
        System.out.println(user);
        ObjectToJson.writeToJsonFile(user);
    }

}
