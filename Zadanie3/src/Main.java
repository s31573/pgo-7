import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(1, "Kilof"));
        items.add(new Item(2, "Czapka"));
        items.add(new Item(3, "Kurtka"));
        items.add(new Item(4, "Zegarek"));
        items.add(new Item(5, "Okulary"));
        items.add(new Item(6, "Bransoletka"));
        items.add(new Item(7, "Pierscien"));
        items.add(new Item(8, "Piersiowka"));
        items.add(new Item(9, "Butelka"));
        items.add(new Item(10, "Bron"));

        HashMap<Integer, String> it = new HashMap<>();

        for(Item item : items.subList(0, 5)){
            it.put(item.id, item.name);
        }

        for(Map.Entry<Integer, String> item : it.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }

    }
}
