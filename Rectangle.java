package demo;

import java.util.Scanner;

public class Rectangle {
	
	
	static double length;
	static double width;
	
	
public double calculatearea(double length,double width) {
		
		return (length*width);
	}
	public double calculateperimeter(double length,double width) {
		
		return(2*(length+width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Rectangle rc=new Rectangle();
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of length:");
		length=sc.nextDouble();
		System.out.println("Enter value of width:");
		width=sc.nextDouble();
		
		System.out.println("Area of Square:"+rc.calculatearea(length,width));
		System.out.println("perimeter of square:"+rc.calculateperimeter(length,width));
	}

}

	

	
	
