
import java.util.ArrayList;


public class BirdDatabase {
    
    private ArrayList<Bird> birdList;
    
    public BirdDatabase(){
        this.birdList = new ArrayList<>();
    }
    
    public void addBird(Bird bird){
        this.birdList.add(bird);
    }
    
    public boolean birdExists(String name){
        for(Bird bird: birdList){
            if(bird.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public Bird getBird(String name){
        for(Bird bird: birdList){
            if(bird.getName().equals(name)){
                return bird;
            }
        }
        return null;
    }
    
    public void printBirds(){
        for(Bird bird: birdList){
            System.out.println(bird);
        }
    }
}
