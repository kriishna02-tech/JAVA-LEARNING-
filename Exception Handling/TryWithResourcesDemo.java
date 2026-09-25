class MyResource implementing  AutoCloseable{
    String name ;
    
    MyResource(String name ){
        this.name = name;
    }

    public void close(){
        System.out.println("Closing resource: " + name);
    }
}

public class TryWithResourcesDemo {
    
}
