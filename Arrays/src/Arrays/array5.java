package Arrays;
import java.util.*;

public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Smallest two: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest two: " + arr[n - 2] + ", " + arr[n - 1]);

        
    }
}
