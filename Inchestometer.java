package com.projectc.com;

import java.util.Scanner;

public class Inchestometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Take Inch:");
		Scanner sc=new Scanner(System.in);
             double A=sc.nextDouble();
             
             double meters = A* 0.0254;
             System.out.print("After conversion in meter:"+meters);
	}

}
