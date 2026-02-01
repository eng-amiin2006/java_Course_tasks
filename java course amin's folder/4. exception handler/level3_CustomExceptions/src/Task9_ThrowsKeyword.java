import java.io.FileReader;
import java.io.IOException;

public class Task9_ThrowsKeyword {
    public static void readFile() throws IOException
    {
        FileReader reader = new FileReader("D:\\java course amin's folder\\4. exception handler\\test.txt");
        int data ;
        while ( (data=reader.read()) != -1)
        {
            System.out.print((char) data);
        }
    }
    public static void main (String[] args)
    {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("error while reading");
        }
    }
}
