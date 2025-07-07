package Arrays;
import java.util.*;
public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements (space-separated):");
        String input = sc.nextLine();
        String[] parts = input.trim().split("\\s+");
        int[] ar = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            ar[i] = Integer.parseInt(parts[i]);
        }        
        int[] result = new int[ar.length];
        int index = 0;
        for (int num : ar) {
            if (num != 10) {
                result[index++] = num;
            }
        }
        System.out.println("Modified array: " + Arrays.toString(result));
       
    }
}
