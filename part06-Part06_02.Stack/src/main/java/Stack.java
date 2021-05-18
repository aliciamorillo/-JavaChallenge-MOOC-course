
import java.util.ArrayList;
import java.util.Collections;


public class Stack {
    
    private ArrayList<String> values;
    
    public Stack(){
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(values.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    public void add(String value){
        values.add(0, value);
    }
    
    public ArrayList<String> values(){
        return values;
    }
    
    public String take(){
        return this.values.remove(0);
    }
}
