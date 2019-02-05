import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ValueArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 3, 4, 5, 6, 50, 45, 34, 42, 12, 17, 46, 20, 28, 45, 50);
        Scanner key = new Scanner(System.in);
        Collections.sort(list);
        System.out.print("Array List: [");
        for (int y:list) {
            System.out.print(y + " ");
        }
        System.out.println("]");
        System.out.println("Value to find: ");
        Integer x = key.nextInt();

        Integer searchIndex = Collections.binarySearch(list, x);
        int xx = Collections.frequency(list, x); //the amount of times a duplicate is there.
        if(searchIndex >=0){
            System.out.println(x+" was found "+xx+" times");
        }else{
            System.out.println("Number not found:" + x);
        }
    }
}
