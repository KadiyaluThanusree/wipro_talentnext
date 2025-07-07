package Arrays;
import java.util.Scanner;
public class array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][2];
        System.out.println("Enter 4 integer numbers:");
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 2; b++) {
                array[a][b] = sc.nextInt();
            }
        }
        System.out.println("The given array is :");
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("The reverse of the array is :");
        for (int u = 1; u >= 0; u--) {
            for (int p = 1; p >= 0; p--) {
                System.out.print(array[u][p] + " ");
            }
            System.out.println();
        }
    }
}
