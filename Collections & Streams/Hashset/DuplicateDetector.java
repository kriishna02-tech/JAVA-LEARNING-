import java.util.HashSet;

public class DuplicateDetector {
    public static void main(String[] args) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        HashSet<Integer> duplicateNumbers = new HashSet<>();

        int[] numbers = {10, 20, 30, 10, 40, 20, 50, 30, 10};
        int countDuplicate =0 ;
        for(int i =0 ; i<numbers.length ; i++){
            int num = numbers[i];
            if(uniqueNumbers.contains(num)){
                countDuplicate++;
                duplicateNumbers.add(num);
            }else{
                uniqueNumbers.add(num);
            }
        }
        System.out.println("unique : " + uniqueNumbers);
        System.out.println("Duplicate : " + duplicateNumbers);
        System.out.println("no of duplicate : "+ countDuplicate);
        System.out.println("Siz of unique set : " + uniqueNumbers.size());
        System.out.println("Siz of duplicate set : " + duplicateNumbers.size());
    }
}
