interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Yes, it can fly");
    }

    @Override
    public void swim() {
        System.out.println("Yes, it can also swim...");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        d1.fly();
        d1.swim();
    }
}