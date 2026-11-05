import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("m", "019587966", "m@gmail.com"));
        contacts.add(new Contact("h", "0231558", "h@gamil.com"));
        contacts.add(new Contact("j", "53654785", "j@gmail.com"));

        for(Contact x : contacts){
            System.out.println(x);
        }
    }
}