package java_fun;
import java.util.*;
public class question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        char e=sc.next().charAt(0);
        if(e>'a' && e<'z') {
        	System.out.println("Alphabhet");
        	}
        else if(e>0 && e<9) {
        	System.out.println("Digit");
        }
        else {
        	System.out.print(" Special Character ");
        }
	}

}
