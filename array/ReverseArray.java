import  java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter arr size :");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0;i<n ;i++){
            System.out.print("arr["+i+"] : ");
            arr[i]=sc.nextInt();
        }
        
        int l =0;
        int r= n-1;
        
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        
         for(int i =0 ; i< n ; i++){
            // System.out.print("Arr["+i  +"] : ");
            // System.out.println(arr[i]);
            System.out.print(arr[i]+ " ");
        }
    }
}
