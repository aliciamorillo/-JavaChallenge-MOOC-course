
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String wordInput = scanner.nextLine();
        
        print(wordInput);
        print(wordInput);
        print(wordInput);

    }
    
    public static void print(String wordInput){
        System.out.print(wordInput);
    }
}
