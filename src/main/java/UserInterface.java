import java.util.Scanner;

public class UserInterface {
    Scanner s;
    String input;

    public UserInterface() {
        this.s = new Scanner(System.in);
        this.input = null;
    }

    public void go() {
        System.out.println("Options");
        System.out.println("Create new task press 1");
        System.out.println("Update an existing task press 2");
        System.out.println("Delete any existing tasks press 3");
        System.out.println("List all tasks press 4");
        System.out.println("List all tasks that are not done press 5");
        System.out.println("List all tasks that are in progress press 6");
        System.out.println("To exit press 0");
        input = s.nextLine();
        while(!input.equals("0")) {
            switch (input) {
                case "1" -> {
                    System.out.println("Enter a short description of task");
                    String d = s.nextLine();
                    Task t = new Task("d");
                    // add the task to the task list
                    break;
                }
                case "2" -> {
                    System.out.println("Enter ID of the task you want to update");
                    input = s.nextLine();
                    // use a for loop to check if the specific task is in the list
                    // if it is found update, otherwise return that it does not exist
                    break;
                }
                case "3" -> {
                    System.out.println("Enter ID of the task you want to delete");
                    input = s.nextLine();
                    // if it exists delete it, otherwise return that it does not exist
                    break;
                }
                case "4" -> {
                    // print the entire list of tasks

                    break;
                }
                case "5" -> {
                    // loop through the list and see which task is not done and print
                    break;
                }
                case "6" -> {
                    // print the tasks that have been completed
                    break;
                }
            }
        }




    }


}