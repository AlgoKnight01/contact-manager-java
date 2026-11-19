import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadTest {
    public static void main(String[] args) {
        try{
            File file = new File("contacts.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // System.out.println(line);
                String[] parts = line.split(",");
                System.out.println(parts[0]);
                System.out.println(parts[1]);
            }

            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        
    }
}
