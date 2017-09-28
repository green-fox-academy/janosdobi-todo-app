public class Todo {

    public static void main(String[] args) {

        if (args.length == 0) {
            TodoList myTodo = new TodoList();
        }else if (args[0].startsWith("-l")) {
            TodoList myTodo = new TodoList("input");
            myTodo.getList();
        } else if (args[0].startsWith("-a")) {
            TodoList myTodo = new TodoList("input");
            myTodo.setList(args[1]);
        } else if (args[0].startsWith("-c")) {
            TodoList myTodo = new TodoList("input");
            myTodo.checkItem(args[1]);
        } else if (args[0].startsWith("-r")) {
            TodoList myTodo = new TodoList("input");
            myTodo.removeItem(args[1]);
        }
    }
}