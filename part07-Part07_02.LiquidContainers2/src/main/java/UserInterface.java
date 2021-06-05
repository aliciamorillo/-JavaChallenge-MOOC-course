
import java.util.Scanner;


public class UserInterface {
    
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;
    
    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner){
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            if (command.equals("add")) {
                firstContainer.add(amount);

            } else if (command.equals("move")) {
                if((firstContainer.contains() - amount) >= 0){
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    int moveAmount = firstContainer.contains();
                    firstContainer.remove(moveAmount);
                    secondContainer.add(firstContainer.contains() + moveAmount);
                }

            } else if (command.equals("remove")) {
                this.secondContainer.remove(amount);
            }
        }

        System.out.println("First: " + firstContainer);
        System.out.println("Second: " + secondContainer);
    }
    
}
        
    

