/////////  ----------  PERSON------------///////////

abstract class Person {
    private String name;
    private int age;

    //contructor 
    Person(String name , int age){
        this.name=name;
        this.age=age;
    }

    //Normal method.
    void displayInfo(){
        System.out.println("Name  : " + name);
        System.out.println("Age  : " + age);
    }
    
    abstract String getRole();

}

class Student extends Person{
    protected int rollNo;
    protected String borrowedBooks;

    Student(String name , int age , int rollNo ,String borrowedBooks){
        super(name, age);
        this.rollNo=rollNo;
        this.borrowedBooks=borrowedBooks;
    }

    @Override
    String getRole() {
        
    }

}

class Librarian extends Person{
    int employeeId;

    Librarian(String name, int age , int employeeId){
        super(name, age);
    }

    @Override 
    String getRole(){

    }

}

class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
    private boolean isIssued= false;

    Book(int bookId , String title , String author , double price , boolean isIssued){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isIssued = isIssued;
    }

    void issue(){
        isIssued=true;
    }

    void returnBook(){
        isIssued= false;
    }

    void display(){
        System.out.println("Book ID  : " + bookId);
        System.out.println("Book Title  : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price  : " + price);
        System.out.println("Book availablity status  : " + isIssued);
    }
}


class Library extends Library{
    Book[] books = new Book[10];
    static int totalBooks=0;

     public boolean addBook(int id, String t, String a, double p, boolean is) {
        if (totalBooks >= books.length) {
            System.out.println("Library full. Cannot add more books.");
            return false;
        }
        books[totalBooks] = new Book(id, t, a, p, is);
        totalBooks++;
        return true;
    }
}
// main funtion
public class LibraryManagementSystem {
    
}
