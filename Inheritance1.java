package oop;

import java.util.Scanner;



public class Inheritance1 extends Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Take input radius:");
		
		double R=sc.nextDouble();
		 Inheritance1 b=new Inheritance1();
		  b.main(R);
		  System.out.println("Area of circle :"+b.Area);
		
    

	}

}
