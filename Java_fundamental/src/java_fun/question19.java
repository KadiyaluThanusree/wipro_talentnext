package java_fun;
import java.util.*;

public class question19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int l = sc.nextInt();

        for (int a = 1; a <= l; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" * ");
            }
            System.out.println(); 
        }

       
    }
}
