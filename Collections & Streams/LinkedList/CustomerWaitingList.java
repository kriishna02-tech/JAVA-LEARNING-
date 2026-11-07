import java.util.LinkedList;
public class CustomerWaitingList {
    public static void main(String[] args) {
        LinkedList<String> customers = new LinkedList<>();
        
        customers.offerLast("om");
        customers.offerLast("suresh");
        customers.offerLast("mahesh");
        customers.offerLast("ganesh");
        customers.offerLast("jagga");

        customers.offerFirst("krishna");
        customers.offerFirst("shiva");

        System.out.println("Waiting List : " + customers);

        for(int i = 0 ; i<8 ; i++){
            String served = customers.pollFirst();

            if(served == null){
                System.out.println("Waiting list is empty");
            }
            else{
                System.out.println(served);
            }
        }

        System.out.println("Waiting List : " + customers);
        System.out.println("NO of waiting customers : "+ customers.size());



    }
}
