
public class jaggedArray {
    public static void main(String[] args) {
        // Jagged array initialization
        int[][] arr = {
            {1, 2, 3},
            {4},
            {5, 6, 7, 8, 9}
        };

        // 1. Printing the matrix elements
        System.out.println("Matrix elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 2. Calculating the sum (works even with different row lengths)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}