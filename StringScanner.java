package com.projectc.com;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("First name:");
		
		String A=sc.next();
		
		System.out.println("Last name:");
		String B=sc.next();
		
		
		System.out.println("Full name:"+A+B);
		
		System.out.println("Full name:"+A+" "+B);
	}

}
