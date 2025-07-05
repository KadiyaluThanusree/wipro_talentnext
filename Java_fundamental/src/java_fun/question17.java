package java_fun;
import java.util.*;

public class question17 {
    public static void main(String[] args) {
        for (int num = 10; num <= 99; num++) {
            

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                	 System.out.println(num + " ");
                  
                }
            }

             
        }
    }
}
