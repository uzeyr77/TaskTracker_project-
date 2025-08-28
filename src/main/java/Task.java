import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.Gson;

public class Task {
    private int id;
    private String description;
    private String status;
    @JsonFormat(pattern = "yyyy-MM-dd") // annotation to make sure when task obj --> json object it follows this format
    private LocalDate createdAt;
    //private LocalDate updatedAt;
    static int count = 0;
    //ArrayList<Task> list;
    private String updateTime;

    public Task(String description, String status) {
        this.id = ++count;
        this.status = status;
        this.description = description;
        this.createdAt = LocalDate.now();
        this.updateTime = "N/A";
    }

    public Task() {
        this.id = ++count;
        this.createdAt = LocalDate.now();
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

    public String getCreatedAt() {
        String d = "" + this.createdAt;
        return d;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updateTime;
    }

    public void setUpdatedAt(String updatedAt) {

        //this.updatedAt = updatedAt;
        updateTime = updatedAt;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public void setStatus(String status) {
        this.status = status;


    }

//    //public void updateTime() {
//        this.updatedAt = LocalDate.now();
//    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(description, task.description) && Objects.equals(status, task.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, status);
    }





    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", created at= '" + createdAt + '\'' +
                ", updated at= '" + updateTime + '\'' +
                '}';
    }
}