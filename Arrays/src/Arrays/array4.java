package Arrays;
import java.util.*;
public class array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int a=0;a<n;a++) {
			ar[a]=sc.nextInt();
		}
		char ch[]=new char[n];
		for(int a=0;a<n;a++) {
			ch[a]=(char)ar[a];
		}
		for(int a=0;a<n;a++) {
		System.out.println(ch[a]);

	}
	}

}