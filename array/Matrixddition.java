import java.util.Scanner;
public class Matrixddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr row :");
        int n = sc.nextInt();
        System.out.print("Enter arr column :");
        int m = sc.nextInt();
        
        int[][] arr = new int[n][m];
        
        for(int i= 0 ; i< n ;i++){
            for(int j = 0; j<m ; j++){
                System.out.print("arr["+i+"][" +j+"] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ;i<n ; i++){
            for(int j = 0; j<m ; j++){
            System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
        int sum = 0;
        for(int i = 0 ;i<n ; i++){
            for(int j = 0; j<m ; j++){
            sum+=arr[i][j];
            }
        }
        System.out.print("sum : " +sum);
        
    }
}
