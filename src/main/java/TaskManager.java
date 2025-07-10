import java.io.FileWriter;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class TaskManager {
    //private Task task;
    private ArrayList<Task> tasks;
    private ObjectMapper objMapper;
    private ArrayList<ObjectNode> jsonNodeList;

    public TaskManager() {
        objMapper = new ObjectMapper(); // obj mapper to write
        this.jsonNodeList = new ArrayList<>();
    }

    public void createNode(Task task) {
        // after we create the task objects from prompting the user, then call this
        // method to create nodes
        ObjectNode node = objMapper.createObjectNode();

        node.put("description", task.getDescription());
        node.put("status", task.getStatus());

        jsonNodeList.add(node);
    }

    public void writeToFile() {

        try {
            objMapper.writeValue(new File("data/info.json"), jsonNodeList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}