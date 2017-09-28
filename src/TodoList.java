import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {

    private ArrayList<String> myTodoList;

    public TodoList() {
        myTodoList = new ArrayList<>();
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println("");
        System.out.println("Command line arguments:");
        System.out.println("-l   Lists all the tasks");
        System.out.println("-a   Adds a new task");
        System.out.println("-r   Removes a task");
        System.out.println("-c   Completes a task");
        System.out.println("");
    }

    public void getList() {
        Path path = Paths.get("C:/Users/PC-DJ/Documents/GreenFox/janosdobi-todo-app/src/Data.txt");
        try {
            List<String> myList = Files.readAllLines(path);
            if (myList.size() == 0) {
                System.out.println("No todos for today!");
            } else {
                for (int i = 0; i < myList.size(); i++) {
                    myTodoList.add(myList.get(i));
                    System.out.println(i + 1 + " - " + myList.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setList(String input) {
        Path path = Paths.get("C:/Users/PC-DJ/Documents/GreenFox/janosdobi-todo-app/src/Data.txt");

        try {
            List<String> myList = Files.readAllLines(path);
            for (int i = 0; i < myList.size(); i++) {
                myTodoList.add(myList.get(i));
            }
            myTodoList.add(input);
            Files.write(path, myTodoList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
