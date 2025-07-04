package java_fun;
import java.util.*;
public class question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter color code(R,B,G,O,Y,W): ");
        char a=sc.next().toUpperCase().charAt(0);
        switch(a) {
        case 'R':
        	System.out.println("Red");
        	break;
        case 'B':
        	System.out.println("Blue");
        	break;
        case 'G':
        	System.out.println("Green");
        	break;
        case 'O':
        	System.out.println("Orange");
        	break;
        case 'Y':
        	System.out.println("Yellow");
        	break;
        case 'W':
        	System.out.println("White");
        	break;
        default:
        	System.out.println("Invalid code");
        }
	}

}
