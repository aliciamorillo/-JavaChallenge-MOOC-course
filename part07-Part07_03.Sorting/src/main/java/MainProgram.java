
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 2, 5, 4, 8};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        
        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
    
        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 1, 0);
        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 0, 3);
        System.out.println(Arrays.toString(array));
        
        MainProgram.sort(array);
    }
    
    public static int smallest(int[] arr){
        int smallest = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int index = 0;
        int min = array[index];

        for (int i = 1; i < array.length; i++){
            if (array[i] <= min){
            min = array[i];
            index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int index = startIndex;
        int min = table[index];
        
        for (int i = startIndex; i < table.length; i++){
            if (table[i] <= min){
                min = table[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    public static void sort(int[] array) {
        int index = 0;

        while (index < array.length) {
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            
            index += 1;
        }        
    }
}
