
import java.util.Scanner;


public class UserInterface {
    
    private Scanner scan;
    private BirdDatabase birdList;
    
    public UserInterface(Scanner scan){
        this.scan = scan;
        this.birdList = new BirdDatabase();
    }
    
    public void start(){
        
        while(true){
            System.out.println("? ");
            String input = scan.nextLine();
            
            if(input.equals("Quit")){
                break;
            }
            
            if(input.equals("Add")){
                System.out.println("Name: ");
                String birdName = scan.nextLine();
                System.out.println("Name in latin: ");
                String latinName = scan.nextLine();
                this.birdList.addBird(new Bird(birdName, latinName));
            }
            
            if(input.equals("Observation")){
                System.out.println("Bird? ");
                String inputBird = scan.nextLine();
                
                if(this.birdList.birdExists(inputBird)){
                    Bird bird = this.birdList.getBird(inputBird);
                    bird.addObservation();
                } else {
                    System.out.println("Not a bird!");
                }
            }
            
            if(input.equals("All")){
                this.birdList.printBirds();
            }
            
            if(input.equals("One")){
                System.out.println("Bird? ");
                String inputBird = scan.nextLine();
                
                if(this.birdList.birdExists(inputBird)){
                    Bird bird = this.birdList.getBird(inputBird);
                    System.out.println(bird);
                } else {
                    System.out.println("Not a bird!");
                }
            }
        }
    
    }
    
}
