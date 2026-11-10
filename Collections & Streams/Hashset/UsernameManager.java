import java.util.HashSet;
import java.util.Scanner;
public class UsernameManager {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        usernames.add("krishna kumar");  //
        usernames.add("mohit kumaAR");
        usernames.add("krishna kumar");  //last same input will be desroyed and this will be store instred of last input 
        usernames.add("KRISHNA KUMAR");
        usernames.add("sonit singh");
        usernames.add("pujit Raj");

        System.out.println("Username :" + usernames);

        System.out.println("Enter the username :");
        String uName = sc.nextLine();

        if(usernames.add(uName)){
            System.out.println("Username registered successfully.");
        }else{
            System.out.println("User already exits");
        }
        System.out.println("Size : "+ usernames.size());
    }
}
