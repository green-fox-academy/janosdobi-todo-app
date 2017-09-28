import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Todo {

    //empty constructor prints out usage info
    public Todo() {
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
        Path path = Paths.get("src/Data.txt");
        try {
            List<String> myList = Files.readAllLines(path);
            for (String item : myList) {
                System.out.println(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
