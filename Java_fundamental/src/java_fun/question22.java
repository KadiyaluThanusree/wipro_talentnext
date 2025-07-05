package java_fun;
import java.util.*;
public class question22 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if (Character.isLowerCase(ch)) {
	            System.out.println("i/p:" + ch);
	            System.out.println("o/p:" + ch + "->" + Character.toUpperCase(ch));
	        } else if (Character.isUpperCase(ch)) {
	            System.out.println("i/p:" + ch);
	            System.out.println("o/p:" + ch + "->" + Character.toLowerCase(ch));
	        } else {
	            System.out.println("Please enter a valid alphabet.");
	        }

	        sc.close();
	    }
	
            
	}
