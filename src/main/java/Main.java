//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    Gson g = new Gson();
    TaskManager tm = new TaskManager();
    Task t1 = new Task();
    t1.setDescription("Tester task");
    t1.setStatus("incomplete");
    Task t2 = new Task();
    t2.setDescription("tester v2");
    t2.setStatus("sdsd");

    tm.addToList(t1); tm.addToList(t2);





    }
}