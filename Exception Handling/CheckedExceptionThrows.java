
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionThrows{
    public static void readFile(String path) throws IOException{
        BufferedReader  reader = new BufferedReader(new FileReader(path));
        String line;
        while((line  = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
    public static void main(String[] args){
        try{
            readFile("test.txt");
        }
        catch(IOException e){
            System.out.println("error reading file " + e.getMessage());
        }
        
    }
}