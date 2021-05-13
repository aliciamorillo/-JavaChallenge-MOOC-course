
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
//        System.out.print("Where to? ");
//        int input = Integer.valueOf(scanner.nextLine());
//        
//        for (int i = 1; i < input+1; i++) {
//            System.out.println(i);
//        }
        
        System.out.print("Where to? ");
        int inputTo = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int inputFrom = Integer.valueOf(scanner.nextLine());
        
        if(inputTo >= inputFrom){
            for (int j = inputFrom; j < inputTo+1; j++) {
                System.out.println(j);
            }
        }
        
    }
}
