package com.projectc.com;

import java.util.Scanner;

public class Largestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println("Take three no.s:");
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		if(A>=B && A>=C) {
			System.out.println("A is large:"+A);
		}else if(B>=A && B>=C) {
			
			System.out.println("B is large:"+B);
		}else {
			
			System.out.println("C is large:"+C);
		}
		
		
	}

}
