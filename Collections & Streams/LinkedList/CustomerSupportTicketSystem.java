
import java.util.LinkedList;
import java.util.Scanner;

class Ticket {
    private int ticketId;
    private String customerName;
    private String issue;
    private String priority;

    public Ticket(int ticketId, String customerName, String issue, String priority) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.issue = issue;
        this.priority = priority;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssue() {
        return issue;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId
                + " | Customer: " + customerName
                + " | Issue: " + issue
                + " | Priority: " + priority;
    }
}

public class CustomerSupportTicketSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Ticket> tickets = new LinkedList<>();

        int choice;

        do {
            System.out.println("\n1. Add ticket details");
            System.out.println("2. Print tickets");
            System.out.println("0. Exit the program");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.print("Enter ticket ID: ");
                    int userTicketId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter customer name: ");
                    String ticketUserName = sc.nextLine();

                    System.out.print("Enter issue: ");
                    String ticketIssue = sc.nextLine();

                    System.out.print("Enter priority (HIGH/NORMAL): ");
                    String ticketPriority = sc.nextLine();

                    Ticket newTicket = new Ticket(
                            userTicketId,
                            ticketUserName,
                            ticketIssue,
                            ticketPriority
                    );

                    if ("HIGH".equalsIgnoreCase(ticketPriority)) {

                        int idx = 0;

                        for (Ticket t : tickets) {
                            if ("HIGH".equalsIgnoreCase(t.getPriority())) {
                                idx++;
                            } else {
                                break;
                            }
                        }

                        tickets.add(idx, newTicket);
                        System.out.println("HIGH priority ticket added!");

                    } else if ("NORMAL".equalsIgnoreCase(ticketPriority)) {

                        tickets.offerLast(newTicket);
                        System.out.println("NORMAL priority ticket added!");

                    } else {
                        System.out.println("Invalid priority!");
                    }

                    break;
                }

                case 2: {
                    if (tickets.isEmpty()) {
                        System.out.println("Ticket list is empty");
                    } else {
                        System.out.println("\nAll tickets:");

                        for (Ticket t : tickets) {
                            System.out.println(t);
                        }
                    }
                    break;
                }

                case 0: {
                    System.out.println("Exiting...");
                    break;
                }

                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }

        } while (choice != 0);

        sc.close();
    }
}
