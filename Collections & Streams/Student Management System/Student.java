
public class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id , String name , int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getMarks(){
        return this.marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
    @Override 
    public String toString(){
        return "Id : "+ this.id + " | Name : " + this.name + " | Marks : " + this.marks;
    }
}
