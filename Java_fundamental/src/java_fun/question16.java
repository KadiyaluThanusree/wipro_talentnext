package java_fun;
import java.util.*;
public class question16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
            	System.out.println(i + "prime");
            }
            else {
            	System.out.println("not prime");
            }

	}

}
}