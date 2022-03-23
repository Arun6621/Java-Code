package com.projectc.com;

import java.util.Scanner;

public class Addusingscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Value of A:");
	    int A=sc.nextInt();
	 
	    System.out.println("Value of B:");
        int B=sc.nextInt();
   
        int C=A+B;
   
        System.out.println("Value of C:"+C);
	}

}
