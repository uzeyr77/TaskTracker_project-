

import java.io.FileWriter;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//    Task t1 = new Task();
//    Task t2 = new Task();
//    t2.setDescription("make food");
//    t1.setDescription("walk dog");
//
//    ObjectMapper objMapper = new ObjectMapper(); // used for writing json
//
//    ObjectNode jsonNode1 = objMapper.createObjectNode(); // create a json object node
//    jsonNode1.put("description", t1.getDescription()); // put the data that we need title --> data
//
//    ObjectNode jsonNode2 = objMapper.createObjectNode(); // create a new obj for every task
//
//    jsonNode2.put("description", t2.getDescription());
//
//
//    ArrayList<ObjectNode> objNodeList = new ArrayList<>();
//
//    objNodeList.add(jsonNode1); objNodeList.add(jsonNode2);
//
//    try {
//        objMapper.writeValue(new File("data/info.json"), objNodeList);
//    } catch (IOException e) {
//        throw new RuntimeException(e);
//    }

        UserInterface ui = new UserInterface();

        ui.go();








    }
}