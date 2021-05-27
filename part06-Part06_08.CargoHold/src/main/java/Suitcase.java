
import java.util.ArrayList;


public class Suitcase {
    
    private ArrayList<Item> items = new ArrayList(); 
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }
    
    public String toString(){
        
        String itemString = "";

        if(items.isEmpty()){
            itemString = "no items (" + this.totalWeight() + " kg)";
        } else if(items.size() == 1){
            itemString = items.size() + " item (" + this.totalWeight() + "kg)";
        } else {
            itemString = items.size() + " items (" + this.totalWeight() + "kg)";
        }
        
        return itemString;
    }
    
    public void printItems(){
        for(Item item: items){
            System.out.println(item);
        }
    }

        
    public int totalWeight() {
        int sumOfWeights = 0;
        for (Item entry : items) {
            sumOfWeights += entry.getWeight();
        }
        return sumOfWeights;
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for(Item item: items){
            if(heaviestItem.getWeight() < item.getWeight()){
                heaviestItem = item;
            }
        }
                
        return heaviestItem;
    }
    
}
