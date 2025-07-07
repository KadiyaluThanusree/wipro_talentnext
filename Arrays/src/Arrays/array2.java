package Arrays;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);	      
		 int n=sc.nextInt();
			int avg=0,sum=0;
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int max=arr[0];
			int min=arr[0];
			for(int i=1;i<n;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			System.out.println(max + " maximum ");
			System.out.print(min + " minimum ");


	}

}
