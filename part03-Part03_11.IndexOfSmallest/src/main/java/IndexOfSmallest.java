
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        
        int index;
        int smallest = Collections.min(list);

        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < list.size(); i++) {
            int listNumber = list.get(i);
            if(listNumber == smallest){
                index = i;
                System.out.println("Found at index: " + index);
            }
        }
        
    }
}
