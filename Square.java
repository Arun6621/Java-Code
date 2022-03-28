package demo;

import java.util.Scanner;

public class Square {
	
	
	static double a;
	
	
	public double calculatearea(double a) {
		
		return (a*a);
	}
	public double calculateperimeter(double a ) {
		
		return(4*a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Square s=new Square();
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Suare:");
		a=sc.nextDouble();
		
		System.out.println("Area of Square:"+s.calculatearea(a));
		System.out.println("perimeter of square:"+s.calculateperimeter(a));
	}
	
	}
	
	


