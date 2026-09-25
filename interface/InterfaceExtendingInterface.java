interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {

    @Override
    public void eat() {
        System.out.println("Dog eats food");
    }

    @Override
    public void play() {
        System.out.println("Dogs are playful");
    }
}

public class InterfaceExtendingInterface {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.play();
    }
}