package java_fun;
import java.util.*;
public class question18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int sum = 0;

        while (a > 0) {
            sum += a % 10;  
            a = a / 10;  
        }

        System.out.println("Sum of digits: " + sum);
    }
}