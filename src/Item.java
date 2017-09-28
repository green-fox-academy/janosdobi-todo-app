public class Item {
    private String name;
    private boolean completed;

    public Item(String name) {
        this.name = name;
        completed = false;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }
}