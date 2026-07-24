import  java.util.Scanner;
public class Greatest_Number {
    public static  void  main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a");
        int  a = sc.nextInt();
        System.err.println("Enter b");
        int  b = sc.nextInt();
        System.err.println("Enter c");
        int  c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.err.println("A is greatest number");
            }
            else{
                System.err.println("C is greatest number");
            }
        }
        else{
             if(b>c){
                System.err.println("B is greatest number");
            }
            else{
                System.err.println("C is greatest number");
            }
        }
    }
}
