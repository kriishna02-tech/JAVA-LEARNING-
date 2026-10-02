
import java.util.ArrayList;

public class lamdaWithString {
    public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<>();

    name.add("Krishna");
    name.add("alex");
    name.add("sam");
    name.add("john");

    System.out.println("without sorting");
    System.out.println(name);
    
    name.sort((a, b) -> a.compareTo(b));    // THIS IS IMPORTANT
    System.out.println(name);

    }
}
