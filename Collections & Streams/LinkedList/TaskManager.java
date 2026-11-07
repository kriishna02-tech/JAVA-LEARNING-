import java.util.LinkedList;
public class TaskManager {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("working");
        tasks.add("playing");
        tasks.add("coding");
        tasks.add("Studying");
        tasks.add("wondering");

        tasks.addFirst("wake-up");
        tasks.addLast("sleep");

        System.out.println("First task : " + tasks.getFirst());
        System.out.println("last task : " + tasks.getLast());

        tasks.remove();
        tasks.removeLast();

        System.out.println(tasks);
        System.out.println("Number of task : "+ tasks.size());
    }
}
