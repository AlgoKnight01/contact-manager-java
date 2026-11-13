import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while(true){
            System.out.println("1. Add");
            System.out.println("2. List");
            System.out.println("3. Exit");

            System.out.print("Input: ");
            int m = sc.nextInt();
            sc.nextLine();
            
            if(m==1){
                System.out.println("Input: "+m);
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                
                System.out.print("Enter Phone: ");
                String id = sc.nextLine();
            
                System.out.print("Enter email: ");
                String mail = sc.nextLine();

                contacts.add(new Contact(name, id, mail));
                System.out.println("New Contact added successfully");
            }
            else if(m==2){
                System.out.println("Input: "+m);
                int i=1;
                for(Contact x:contacts){
                    System.out.println("Contact no: "+i);
                    System.out.println(x);
                    i++;
                    System.out.println("---------------");
                }
                System.out.println("End of the List");
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