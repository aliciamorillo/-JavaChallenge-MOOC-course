
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(5);

        counter.increase(1);
        counter.decrease(1);
        
        System.out.println(counter);
        
    }
}
