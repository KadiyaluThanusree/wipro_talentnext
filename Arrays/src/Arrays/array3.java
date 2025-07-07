package Arrays;
import java.util.*;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 4, 34, 56, 7};  

        System.out.print("Enter the number to search: ");
        int se = sc.nextInt();

        int index = -1;

        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == se) {
                index = a;
                break;
            }
        }

        System.out.println("Output: " + index);
      
    }
}

