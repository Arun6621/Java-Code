package oop;

import java.util.Scanner;



public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner sc=new Scanner(System.in);
		
		System.out.println("value of height:");
		double a= sc.nextDouble();
		
		System.out.println("Value of Width:");
		double b= sc.nextDouble();
		
		
		
		 Encapsulation r = new  Encapsulation();
	       
		 
		 r.setHeight(a);
	        r.setWidth(b);
	        System.out.println("Area of Rectangle: " +  r.getArea());
	    
		
		
	}

}
