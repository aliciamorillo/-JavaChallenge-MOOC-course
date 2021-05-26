
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        if(elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        int count = 0;
        String elementsList = "";
        
        for(String element: elements){
            count++;
            if(elements.size() <= 1){
                elementsList += element;
            } else {
                elementsList += element + "\n";
            }
            
        }
        
        if(elements.size() <= 1){
            return "The collection " + this.name + " has " + count + " element:\n" 
                + elementsList;
        } else {
            return "The collection " + this.name + " has " + count + " elements:\n" 
                + elementsList;
        }
    }
}
