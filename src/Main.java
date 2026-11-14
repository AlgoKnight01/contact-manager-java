import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. List");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            System.out.print("Input: ");
            int choice = sc.nextInt();
            sc.nextLine();
            //Add Contacts;
            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter Phone: ");
                String phone = sc.nextLine();

                System.out.print("Enter email: ");
                String email = sc.nextLine();

                contacts.add(new Contact(name, phone, email));
                System.out.println("New Contact added successfully");
            } 
            //List of the contact
            else if (choice == 2) {
                int i = 1;
                if (!contacts.isEmpty()) {
                    for (Contact x : contacts) {
                        System.out.println("Contact no: " + i);
                        System.out.println(x);
                        i++;
                        System.out.println("---------------");
                    }
                } else
                    System.out.println("No contacts found");
            } 
            //Search
            else if (choice == 3) {
                boolean found = false;
                System.out.print("Enter name to search: ");
                String searchName = sc.nextLine();
                if (!contacts.isEmpty()) {
                    for (Contact x : contacts) {
                        if (x.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("--------------------");
                            System.out.println(x);
                            System.out.println("--------------------");
                            found = true;
                            break;
                        }
                    }
                } else {
                    System.out.println("List is empty");
                }
                if (!contacts.isEmpty() && !found) {// revision
                    System.out.println("Contact not found");
                }
            } 
            //Delete option
            else if (choice == 4) {
                if(!contacts.isEmpty()){
                    System.out.println("Choose the Contact");
                    for (int j = 0; j < contacts.size(); j++) {
                        System.out.println("Contact no: " + (j + 1)+". "+contacts.get(j).getName());
                    }
                    System.out.print("Input: ");
                    int del= sc.nextInt();
                    if(del>=1 && del<=contacts.size()){
                        contacts.remove(del-1);
                        System.out.println("Deleted");
                    }else{
                        System.out.println("Invalid Input");
                    }
                    
                }else{
                    System.out.println("There is no contact");
                }
                
            } 
            //exit oprion
            else if (choice == 5) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Invalid choice");
            }

        }

    }
}