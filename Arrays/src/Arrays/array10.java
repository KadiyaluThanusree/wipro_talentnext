package Arrays;
import java.util.*;
public class array10 {
	public static void main(String[] args) {			
				        Scanner sc = new Scanner(System.in);
				        System.out.println("Enter size of array:");
				        int n = sc.nextInt();
				        int[] arr = new int[n];
				        int[] result = new int[n];
				        System.out.println("Enter elements:");
				        for (int i = 0; i < n; i++)
				            arr[i] = sc.nextInt();
				        int index =0;
				        for (int i = 0; i < n; i++) {
				            if (arr[i] % 2 == 0)
				                result[index++] = arr[i];
				        }
				        for (int i = 0; i < n; i++) {
				            if (arr[i] % 2 != 0)
				                result[index++] = arr[i];
				        }
				        System.out.println("Even-Odd rearranged array:");
				        for (int num : result)
				            System.out.print(num + " ");


	}

}
