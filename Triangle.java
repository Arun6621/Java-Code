package demo;

import java.util.Scanner;

public class Triangle {
	
	static double a;
	static double b;
	static double c;
	
public double calculatearea(double a,double b) {
		
		return (0.5*a*b);
	}
	public double calculateperimeter(double a,double b,double c) {
		
		return(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Triangle t=new Triangle();
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextDouble();
		System.out.println("Enter the value of b:");
		b=sc.nextDouble();
		System.out.println("Enter the value of c:");
		c=sc.nextDouble();
		
		System.out.println("Area of Triangle:"+t.calculatearea(a,b));
        System.out.println("perimeter of Triangle:"+t.calculateperimeter(a, b, c));
	}
}

	
