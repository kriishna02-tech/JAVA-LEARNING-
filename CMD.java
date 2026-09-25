class person {

    protected String name;
    protected int age;

    person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


class Student extends person{
    protected int rollNo;
    protected double marks;
    static String collage ="NIT-Patna";
    static int noStudents=0;

    Student(String name, int age, int rollNo ,double marks ){
        super(name, age);
        this.rollNo=rollNo;
        this.marks=marks;
        noStudents++;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Roll no  : "+ rollNo);
        System.out.println("Marks  : "+ marks);
        System.out.println("COllege  : "+ collage );
        
    }
}

class gradStudent extends Student {

    private String domain ;

    gradStudent(String name, int age, int rollNo ,double marks, String domain){
        super(name,age,rollNo,marks);
        this.domain=domain;
    } 
    @Override
    void display(){
        super.display();
        System.out.println("Domain  : " + domain);
        System.out.println("No of students  :  "+ noStudents);
        System.out.println("---------------------------------------");
    }
}

public class CMD{
    public static void main(){
        gradStudent s1 = new gradStudent("Krishna kumar", 20, 13, 89, "CSE core");
        gradStudent s2 = new gradStudent("Om jaiswal", 20, 45, 85, "AIML");
        gradStudent s3 = new gradStudent("Mohit singh" , 23, 24, 67, "cyber");

        s1.display();
        s2.display();
        s3.display();
    }
}