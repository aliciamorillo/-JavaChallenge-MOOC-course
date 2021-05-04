
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int age = Integer.valueOf(scan.nextLine());
        
        System.out.println("How old are you? ");
        
        if((age < 0 || age > 120)){
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }

    }
}
