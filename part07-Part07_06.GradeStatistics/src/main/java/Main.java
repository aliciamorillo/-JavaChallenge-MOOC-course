
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GradeRegister register = new GradeRegister();
        
        UserInterface userInterface = new UserInterface(scanner, register);
        
        userInterface.start();

    }
}
