import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("m", "019587966", "m@gmail.com"));
        contacts.add(new Contact("h", "0231558", "h@gamil.com"));
        contacts.add(new Contact("j", "53654785", "j@gmail.com"));

        
        while(true){
            System.out.println("1. Add");
            System.out.println("2. List");
            System.out.println("3. Exit");

            System.out.print("Input: ");
            int m = sc.nextInt();
            
            if(m==1){
                System.out.println("Add selected");
            }
            else if(m==2){
                System.out.println("List selected");
            }
            else if(m==3){
                System.out.println("Goodbye");
                break;
            }else{
                System.out.println("Invalid choice");
            }
            
        }

        
    }
}