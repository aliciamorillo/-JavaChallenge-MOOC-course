
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statisticsTotal = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
        System.out.println("Enter numbers: ");
        
        while(true){
            Integer input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1){
                break;
            }
            
            statisticsTotal.addNumber(input);
            
            if(input % 2 == 0){
                statisticsEven.addNumber(input);
            } else {
                statisticsOdd.addNumber(input);
            }
            
        }
        
        System.out.println("Sum: " + statisticsTotal.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
