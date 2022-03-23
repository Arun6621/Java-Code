package com.projectc.com;

import java.util.Scanner;

public class Checkequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Input first number: ");
         int num1 = sc.nextInt();
         System.out.print("Input second number: ");
         int num2 = sc.nextInt();
		 System.out.print("Input third number: ");
         int num3 = sc.nextInt();
         System.out.print("Input fourth number: ");
         int num4 = sc.nextInt();		
		
		if (num1 == num2 && num2 == num3 && num3 == num4) 
		  {
			System.out.println("Numbers are equal.");
                               }
		else
			{
			System.out.println("Numbers are not equal.");
		}
	

	}

}
