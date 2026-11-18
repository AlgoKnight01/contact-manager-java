import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("test.txt");) {
            fw.write("hello world--");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}