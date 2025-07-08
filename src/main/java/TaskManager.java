import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TaskManager {
    //private Task task;
    private Gson gson;
    private ArrayList<Task> tasks;



    public TaskManager() {
    gson = new Gson();
    this.tasks = new ArrayList<>();
    }

    public void addToList(Task t) {
        tasks.add(t);

    }

    public void writeList() {
        try(FileWriter fileWriter = new FileWriter("data/info.json")) {
            gson.toJson(tasks, fileWriter);
            //fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    // write to the Json file
    public void write() {
        // loop through the arraylist and add the elements to the file



    }

}
