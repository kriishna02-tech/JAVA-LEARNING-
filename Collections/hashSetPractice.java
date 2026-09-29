import java.util.HashSet;

public class hashSetPractice {
    public static void main(String[] args) {
        HashSet<String> categories = new HashSet<>();

        categories.add("Electronics");
        categories.add("Accessories");
        categories.add("Electronics");
        categories.add("Monitors");
        categories.add("Accessories");
        categories.add("Cables");
        
        System.out.println(categories);

        for(String category : categories){
            System.out.println(category);
        }

        if(categories.contains("monitor")){
            System.out.println("Monitor exists");
        }else{
            System.out.println("Monitor doesn't exits");
        }

        System.out.println("no of unique elements : " + categories.size());

        categories.remove("Cables");

        System.out.println(categories);
    }
}
