import java.time.LocalDate;
import java.util.ArrayList;
import com.google.gson.Gson;

public class Task {
    int id;
    String description;
    String status;
    //LocalDate createdAt;
    //LocalDate updatedAt;
    static int count = 0;
    //ArrayList<Task> list;

    public Task() {
        this.id = ++count;

    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public void setStatus(String status) {
        this.status = status;


    }



    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}