
import java.util.ArrayList;


public class Container {
    
    private int totalAmount;
    private int maxContainer = 100;
    
    public Container(){
        this.totalAmount = 0;
    }
    
    public int contains(){
        return this.totalAmount;
    }
    
    public void add(int amount){
        if(amount >= 0){
            if((totalAmount + amount) <= maxContainer){
                totalAmount += amount;
            } else {
                totalAmount = maxContainer;
            }
        }
    }
    
    public void remove(int amount){
        if(amount >= 0){
            if((totalAmount - amount) >= 0){
                totalAmount -= amount;
            } else {
                totalAmount = 0;
            }
        }
    }
    
    public String toString(){
        return  this.totalAmount + "/" + maxContainer;
    }
    
}
