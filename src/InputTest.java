import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Enter an integer");
            String input = sc.nextLine();
            
            try{
                number = Integer.parseInt(input); // ei line tai check kore je convert kora jaitese kina jodi kora jay tahole break are na hole catcha
                break;
            }catch(NumberFormatException e){
                System.out.println("Invalid input, try again");
            }
        }
        System.out.println("you entered: "+ number);
        sc.close();
    }
}
