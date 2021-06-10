
public class Bird {
    
    private String name;
    private String latinName;
    private int watchCount;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.watchCount = watchCount;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addObservation(){
        this.watchCount++;
    }
    
    public String toString(){
        if(this.watchCount == 1){
            return this.name + " (" + this.latinName + "): " + this.watchCount + " observation";
        }
        return this.name + " (" + this.latinName + "): " + this.watchCount + " observations";
    }
}
