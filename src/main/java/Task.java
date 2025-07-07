import java.time.LocalDate;
import java.util.ArrayList;

public class Task {
    int id;
    String description;
    String status;
    LocalDate createdAt;
    LocalDate updatedAt;
    static int count = 0;
    //ArrayList<Task> list;

    public Task(String dscrp) {
        this.id = ++count;
        this.description = dscrp;
        this.createdAt = LocalDate.now();
        this.updatedAt = LocalDate.now();
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

    public LocalDate getTime() {
        return createdAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
        this.updatedAt = LocalDate.now();
    }

    public void setStatus(String status) {
        this.status = status;
        this.updatedAt = LocalDate.now();

    }

    public void setTime(LocalDate time) {
        this.createdAt = time;
        this.updatedAt = LocalDate.now();
    }


}