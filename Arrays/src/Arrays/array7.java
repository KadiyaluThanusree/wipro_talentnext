package Arrays;
import java.util.*;

public class array7 {

    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 54, 34, 89};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num); 
        }

        System.out.println(" Duplicates: " + set);
    }
}
