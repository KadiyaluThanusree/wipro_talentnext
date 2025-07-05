package java_fun;
import java.util.*;

public class question20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int nu = sc.nextInt();
        int reverse = 0;

        while (nu != 0) {
            int digit = nu % 10;         
            reverse = reverse * 10 + digit;  
            nu = nu / 10;            
        }

        System.out.println("Reversed number: " + reverse);

      
    }
}
