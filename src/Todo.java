import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {

        Todo myTodo = new Todo();
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        myTodo = new Todo(command);

    }
}