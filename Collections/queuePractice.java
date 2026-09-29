import java.util.LinkedList;
import java.util.Queue;


public class queuePractice{
    public static void main(String[] args) {
        Queue<String> order = new LinkedList<>();
        System.out.println("empty : " + order.isEmpty()); 
        System.out.println("size : " + order.size());
        order.offer("order-101");
        order.offer("order-102");
        order.offer("order-103");
        order.offer("order-104");
        order.offer("order-105");
        System.out.println(order.peek());
        System.out.println(order.poll());
        System.out.println("size : " + order.size());
        System.out.println(order.peek());
        System.out.println(order.poll());
        System.out.println(order.poll());
        System.out.println(order.poll());
        System.out.println(order.poll());
        System.out.println(order.poll());
        System.out.println("empty : " + order.isEmpty()); 
    }
}