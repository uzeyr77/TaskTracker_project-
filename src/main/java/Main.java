

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    TaskManager tm = new TaskManager();
    UserInterface ui = new UserInterface();
    ui.run(tm);






    // READING
    // Logic flow is:
    // 1. create a map that contains the properties(ID, description etc) as the Key and the values
    // are the give by task1.getID() and so on. String --> Object
//    Map<String, Object> tasks = new HashMap<>(); // maps ID --> Task.getID()
//    List<Map<String, Object>> originalCopy = new ArrayList<>(); // This list is to contain the Map
//    tasks.put("ID", task1.getId());
//    tasks.put("Description", task1.getDescription());
//    tasks.put("Status", task1.getStatus());
//    tasks.put("Created At", task1.getCreatedAt());
//    //tasks.put("Updated At", task1.getUpdatedAt());
//    // read to the file
//        File file = new File("data/writetest.json");
//        try {
//            tm.writeToFile(file);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    //2. create a List<Map<String, Objects>> in order to contain the Map of the json objects// add the map to the list
//    originalCopy.add(tasks);
//
//    // 3. now we read back the file
//    List<Map<String, Object>> fromFile = om.readValue(file, new TypeReference<List<Map<String, Object>>>() {
//    });
//
//    // 4. check for equality
//        System.out.println(originalCopy.equals(fromFile));
//
//        System.out.println(originalCopy);
//        System.out.println(fromFile);
//
//        Object ob = new Task(); // static type is Object but dynamic type is Task
//
//        Task test = new Task("blah", "blah");
//
//        System.out.println(test.equals(null));
//


    }
}