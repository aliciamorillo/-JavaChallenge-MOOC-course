
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int factorial = 1;
        int num = 1;
        
        System.out.print("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        
        while(num <= input){
            factorial *= num;
            num++;
        }
        
        System.out.println("Factorial: " + factorial);

    }
}
