
import java.util.HashMap;

public class hashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> items = new HashMap<>();

        items.put(1, "laptop");
        items.put(2, "mouse");
        items.put(3, "Monitor");
        items.put(4, "Keyboard");
        items.put(5, "Cables");

        for (var item : items.entrySet()) {
            System.out.print(item.getKey() + " -> ");
            System.out.println(item.getValue());
        }
    }
}
