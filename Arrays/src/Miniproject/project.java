package Miniproject;

import java.util.*;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Employee data
        int[] ar = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] n = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] d = {"R&D", "PM", "Acct", "Front desk", "Engg", "Manufacturing", "PM"};
        char[] des= {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        int[] ba = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hr = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] t = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
        
        System.out.print("Enter Employee ID: ");
        int k = sc.nextInt();

        int index = -1;
        for (int a = 0; a < ar.length; a++) {
            if (k == ar[a]) {
                index = a;
                break;
            }
        }

        if (index != -1) {
            
            System.out.println("Emp No   Emp Name   Department      Designation     Salary");
            System.out.print(ar[index] + "   ");
            System.out.print(n[index] + "   ");
            System.out.print(d[index] + "   ");

            int allowance = 0;
            switch (des[index]) {
                case 'e':
                    System.out.print("Engineer     ");
                    allowance = 20000;
                    break;
                case 'c':
                    System.out.print("Consultant   ");
                    allowance = 32000;
                    break;
                case 'k':
                    System.out.print("Clerk        ");
                    allowance = 12000;
                    break;
                case 'r':
                    System.out.print("Receptionist ");
                    allowance = 15000;
                    break;
                case 'm':
                    System.out.print("Manager      ");
                    allowance = 40000;
                    break;
                default:
                    System.out.print("Unknown      ");
                    allowance = 0;
            }

            int salary = ba[index] + hr[index] + allowance - t[index];
            System.out.println(salary);
        } else {
            System.out.println("There is no employee with empid: " + k);
        }
        
       
    }
}
