
import java.util.ArrayList;


public class TodoList {
    
    private ArrayList<String> todos;
    
    public TodoList(){
        this.todos = new ArrayList();
    }
    
    public void add(String task){
        this.todos.add(task);
    }
    
    public void print(){
        for(String task: todos){
            System.out.println((todos.indexOf(task)+1) + ": " + task);
        }
    }
    
    public void remove(int number){
        todos.remove(number - 1);
    }
    
}
