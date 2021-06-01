
import java.util.Scanner;


public class UserInterface {
    
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true){
            System.out.println("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
                        
            String command = scanner.nextLine();
            
            if(command.equals("X")){
                break;
            }
            
            if(command.equals("1")){
                System.out.println("Write the joke to be added:");
                String newJoke = scanner.nextLine();
                jokeManager.addJoke(newJoke);
            }
            
            if(command.equals("2")){
                System.out.println("Drawing a joke:");
                String drawingJoke = jokeManager.drawJoke();
                System.out.println(drawingJoke);
            }
            
            if(command.equals("3")){
                System.out.println("Printing the jokes:");
                jokeManager.printJokes();
            }
        }
        
    }

    
}
