interface Shape{
    double area();
}

class Circle implements Shape {
      double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class  Rectangle implements Shape{
      double length;
      double width;

    public Rectangle(double length ,double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return  length*width;
    }

    
}
public class BasicInterface {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Rectangle r1 = new Rectangle(4,5);

        System.out.println(c1.area());
        System.err.println(r1.area());
    }
}
