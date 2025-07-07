package Arrays;
import java.util.*;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] ar = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);

        System.out.print("Sorted array: ");
        for (int num : ar) {
            System.out.print(num + " ");
        }

        
    }
}
