import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "Młotek"));
        items.add(new Item(2, "Plecak"));
        items.add(new Item(3, "Kilof"));
        items.add(new Item(4, "Siekiera"));
        items.add(new Item(5, "Ziemniak"));

        for(int i = 0; i < items.size(); i++){
            items.get(i).show();
        }

        HashMap<Integer, String> it = new HashMap<>();

        for(Item item : items){
            it.put(item.id, item.name);
        }

        for(Map.Entry<Integer, String> item : it.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }

    }
}