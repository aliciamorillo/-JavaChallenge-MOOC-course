
import java.util.ArrayList;


public class Room {
    
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return persons;
    }
    
    public Person shortest(){
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person shortestElement = this.persons.get(0);
        
        for(Person person: persons){
            if(shortestElement.getHeight() > person.getHeight()){
                shortestElement = person;
            }
        }
        return shortestElement;
    }
    
    public Person take(){
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person shortestElement = this.persons.get(0);
        
        for(Person person: persons){
            if(shortestElement.getHeight() > person.getHeight()){
                shortestElement = person;
            }
        }
        
        this.persons.remove(shortestElement);
        return shortestElement;
    }
}
