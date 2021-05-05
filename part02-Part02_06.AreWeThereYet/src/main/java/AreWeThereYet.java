
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Give a number:");
            
            if(input == 4){
                break;
            }
        }
    }
}
