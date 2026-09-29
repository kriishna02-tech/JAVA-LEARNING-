
class Box<T>{
    private T value;

    public void setter(T value){
        this.value = value;
    }

    public T getter(){
        return value;
    }


}
public class GenericPractice {

    public static <T> void printValue(T val){
        System.out.println(val);
    }
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        Box<String> b2 = new Box<>();
        Box<Double> b3 = new Box<>();

        b1.setter(10);
        System.out.println("value : " + b1.getter());
        
        b2.setter("krishna kumar");
        System.out.println("value : " + b2.getter());
    
        b3.setter(10.00);
        System.out.println("value : " + b3.getter());
        

        printValue(20);
        printValue("orion Edith");
        printValue(30.0);
    }
}
