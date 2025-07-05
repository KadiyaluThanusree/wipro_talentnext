package java_fun;

import java.util.Scanner;

public class question21 {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
        if (args.length == 0) {
        	
            System.out.println("Please enter a number: " +num);
            return;
        }

        int number = Integer.parseInt(args[0]);
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}
