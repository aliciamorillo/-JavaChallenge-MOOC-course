
import java.util.ArrayList;


public class Recipe {
    
    private String recipeName;
    private int recipeTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String recipeName, int recipeTime, ArrayList<String> ingredients){
        this.recipeName = recipeName;
        this.recipeTime = recipeTime;
        this.ingredients = ingredients;
    }
    
    public void setName(String recipeName){
        this.recipeName = recipeName;
    }
    
    public void setIngredients(ArrayList<String> ingredients){
        this.ingredients = ingredients;
    }
    
    public void setTime(int recipeTime){
        this.recipeTime = recipeTime;
    }
    
    public String getName(){
        return this.recipeName;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public int getTime(){
        return this.recipeTime;
    }
    
    public boolean hasIngredient(String ingredient){
        for(String i: this.ingredients){
            if(i.equals(ingredient)){
                return true;
            }
        }
        
        return false;
    }
    
    public String toString(){
        return this.getName() + ", cooking time: " + this.getTime();
    }
    
}
