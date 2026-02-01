import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task5_readFile {
    public static void main (String[] args) throws FileNotFoundException {
       try{
           FileReader reader = new FileReader("D:\\java course amin's folder\\4. exception handler\\test.txt");
           int data ;
           while ( (data=reader.read()) != -1)
           {
               System.out.print((char) data);
           }
       }catch (FileNotFoundException e)
       {
           System.out.println("file not found ");
       } catch (IOException e) {
           System.out.println("Error while reading");
        }
    }
}
