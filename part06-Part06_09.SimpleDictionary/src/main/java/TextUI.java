
import java.util.Scanner;


public class TextUI {
    
    private SimpleDictionary simpleDictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start(){

        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if(command.equals("add")){
                System.out.print("Word:");
                String word = scanner.nextLine();
                System.out.print("Traslation:");
                String traslation = scanner.nextLine();
                this.simpleDictionary.add(word, traslation);
            
            } else if(command.equals("search")){
                System.out.print("To be translated:");
                String traslated = scanner.nextLine();
                System.out.print("Translation:");
                
                    if(this.simpleDictionary.translate(traslated) == null){
                        System.out.println("Word " + traslated + " was not found");
                    } else {
                        System.out.println(this.simpleDictionary.translate(traslated));
                    }
                
            } else {
                System.out.println("Unknown command");
                continue;
            }

            
        }
    }
    
}
