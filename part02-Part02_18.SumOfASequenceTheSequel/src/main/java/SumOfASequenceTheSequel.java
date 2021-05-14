
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("First number? ");
        int inputFirst = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Last number? ");
        int inputLast = Integer.valueOf(scanner.nextLine());
        
        for (int i = inputFirst; i < inputLast+1; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);

    }
}
