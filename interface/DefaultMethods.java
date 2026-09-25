interface Vehicle {

    public abstract void start();

    default void honk(){
        System.out.println("Beep Beep");
    }
}

class Car implements Vehicle {

    public Car() {
    }

    @Override
    public void start() {
        System.err.println("self start...");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle c2 = new Car();

        c1.start();
        c1.honk();
        c2.start();
        c2.honk();
    }
}