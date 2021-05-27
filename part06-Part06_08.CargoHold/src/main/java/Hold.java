
import java.util.ArrayList;


public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList();
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int sumOfWeights = 0;
        
        for(Suitcase suitcase: suitcases){
            sumOfWeights += suitcase.totalWeight();
        }
        return sumOfWeights;
    }
    
    public String toString(){
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase: suitcases){
            suitcase.printItems();
        }
    }
    
}
