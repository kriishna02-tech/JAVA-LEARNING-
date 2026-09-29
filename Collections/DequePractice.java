import java.util.ArrayDeque;
import java.util.Deque;

public class DequePractice {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();
        history.addFirst("Google");
        history.addLast("Youtube");
        history.addLast("Github");
        history.addLast("StackOverFLow");
        System.out.println("Size : "+ history.size());

        System.out.println("First Search : " + history.peekFirst());
        System.out.println("Last Search : " + history.peekLast());
        System.out.println("deleting last search : " + history.pollLast());
        System.out.println("deleting fisrt search : " + history.pollFirst());
        System.out.print("Remaning history : ");
        while(!history.isEmpty()){
            System.out.print(history.pollFirst() + " ");
        }
        System.out.println();
        System.out.println("Size : "+ history.size());
    }
}
