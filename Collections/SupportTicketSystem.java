import java.util.LinkedList;
import java.util.Queue;
public class SupportTicketSystem {
    public static void main(String[] args) {
        Queue<String> ticket = new LinkedList<>();

        ticket.offer("TICKET-001 Login problem");
        ticket.offer("TICKET-002 Payment failed");
        ticket.offer("TICKET-003 Password reset");
        ticket.offer("TICKET-004 Account locked");

        System.out.println("No of waiting list = " + ticket.size());
        System.out.println("Next ticket : " + ticket.peek());
        System.out.println("removing the fist waiting : " + ticket.poll());
        System.out.println("No of waiting list = " + ticket.size());
        ticket.offer("TICKET-005 Email not received");
        while(!ticket.isEmpty()){
            System.out.println("processing the waiting list : " + ticket.poll());
        }

        System.out.println("Queue empty : " + ticket.isEmpty());
    }
}
