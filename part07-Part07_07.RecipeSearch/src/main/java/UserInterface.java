
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private ArrayList<Recipe> recipeList = new ArrayList<>();
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void start(){
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        readFile(fileName);
        
        System.out.println("");
        
        System.out.println("Commands:\n" + "list - lists the recipes\n" +
            "stop - stops the program\n" + "find name - searches recipes by name \nfind cooking time - searches recipes by cooking time\n"
            + " find ingredient - searches recipes by ingredient");
        
        System.out.println("");
        
        while(true){
            System.out.println("Enter a command");
            String input = scanner.nextLine();
            
            if(input.equals("stop")){
                break;
            }
            
            if(input.equals("list")){
                for(Recipe recipe: recipeList){
                    System.out.println(recipe);
                }
            }
            
            if(input.equals("find name")){
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                
                for(Recipe r: recipeList){
                    if(r.getName().contains(word)){
                        System.out.println(r);
                    }
                }
            }
            
            if(input.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int maxTime = Integer.valueOf(scanner.nextLine());
                for(Recipe r: recipeList){
                    if (r.getTime() <= maxTime){
                        System.out.println(r);
                    }
                }
            }
            
            if(input.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredientInput = scanner.nextLine();
                for(Recipe r: recipeList){
                    if(r.hasIngredient(ingredientInput)){
                        System.out.println(r);
                    }
                }
            }
        }
        
    }
    
    public void readFile(String fileName){
    
        try (Scanner reader = new Scanner(Paths.get(fileName))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                if(line.equals("")){
                    continue;
                }
                
                String name = line;
                
                int time = Integer.valueOf(reader.nextLine());
                ArrayList<String> ingredients = new ArrayList();
                
                while (reader.hasNextLine()) {
                    String ingredient = reader.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    
                    ingredients.add(ingredient);
                }
                
                recipeList.add(new Recipe(name,time,ingredients));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        
    }
    
}
