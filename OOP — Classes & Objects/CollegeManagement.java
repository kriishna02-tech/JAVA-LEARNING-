class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
    }
}

class Student extends Person {

    protected int rollNo;
    protected double marks;
    static String college = "NIT Patna";
    static int totalStudents = 0;

    Student(String name, int age, int rollNo, double marks) {
        super(name, age); // Calls Person constructor
        this.rollNo = rollNo;
        this.marks = marks;
        totalStudents++;
    }

    void checkResult() {
        if (marks >= 35) {
            System.out.println("Result         : PASS");
        } else {
            System.out.println("Result         : FAIL");
        }
    }

    @Override
    void display() {
        super.display(); // Reuse Person's display()
        System.out.println("Roll No        : " + rollNo);
        System.out.println("Marks          : " + marks);
        System.out.println("College        : " + college);
        checkResult();
    }
}

class GraduateStudent extends Student {

    private String specialization;

    GraduateStudent(String name, int age,
                    int rollNo, double marks,
                    String specialization) {

        super(name, age, rollNo, marks);
        this.specialization = specialization;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Specialization : " + specialization);
        System.out.println("--------------------------------");
    }
}

public class CollegeManagement {

    public static void main(String[] args) {

        GraduateStudent s1 =
                new GraduateStudent(
                        "Krishna Kumar",
                        20,
                        101,
                        98,
                        "Computer Science");

        GraduateStudent s2 =
                new GraduateStudent(
                        "Rahul",
                        21,
                        102,
                        72,
                        "Artificial Intelligence");

        GraduateStudent s3 =
                new GraduateStudent(
                        "Aman",
                        22,
                        103,
                        30,
                        "Cyber Security");

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Total Students : " + Student.totalStudents);
    }
}