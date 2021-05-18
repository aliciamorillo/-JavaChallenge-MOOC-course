
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        
        int last = array.length-1;
                
        for (int i = 0; i < last; i++) {
            System.out.print(array[i] + ", ");
        }
        
        System.out.println(array[last]);
    }
}
