import java.util.ArrayList;
import java.util.List;

public class ListofItems extends ArrayList {

    private List<Item> items;

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < items.size(); i++) {
            result += (i+1) + ". " + items.get(i) + "\n";
        }
        return result;
    }

}
