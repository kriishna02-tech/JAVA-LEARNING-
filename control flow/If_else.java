import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0){
            System.err.println("num is Even.");
        }
        else{
            System.err.println("nums is odd");
        }
    
    }
}
