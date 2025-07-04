package java_fun;
import java.util.*;
public class question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String h=sc.nextLine();
        int a=sc.nextInt();
        if(h.equals("Female") &&a>=1 && a<=58) {
        	System.out.println("8.2%");
        }
        else if( h.equals("Female") && a>=59 && a<=100) {
        	System.out.println("9.2%");
        }
        else if( h.equals("Male") && a>=1 && a<=58) {
        	System.out.println("8.4%");
        }
        else if( h.equals("Male") && a>=59 && a<=100) {
        	System.out.println("10.5%");
        }
        else {
        	System.out.println("Not Valid");
        }
        
	}

}
