
public class Cube {
    
    private int length;
    
    public Cube(int edgeLength){
        this.length = edgeLength;
    }
    
    public int volume(){
        int volume = this.length * this.length * this.length;
        return volume;
    }
    
    public String toString(){
        return  "The length of the edge is " + this.length + " and the volume " + this.volume();
    }
}
