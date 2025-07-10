import java.util.Scanner;

public class UserInterface {
    Scanner s;
    String input;
    TaskManager tm;
    public UserInterface() {
        this.s = new Scanner(System.in);
        this.input = null;
        this.tm = new TaskManager();
    }

    public void go() {
    // prompt the user for what they want
        //input = s.nextLine();
        String dscp = null;
        String status = null;
        input = "1";
        while(!input.equals("0")) {
            Task task = new Task();
            // get the information to create the task obj, description and status
            System.out.println("enter task description");
            dscp = s.nextLine();

            System.out.println("enter the status");
            status = s.nextLine();

            task.setDescription(dscp);
            task.setStatus(status);

            tm.createNode(task);
            tm.writeToFile();
            //input = s.nextLine();
        }






    }


}