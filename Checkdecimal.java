package com.projectc.com;

import java.util.Scanner;

public class Checkdecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner in = new Scanner(System.in);

	        System.out.print("Input floating-point number: ");
	      
	        double x = in.nextDouble();
	        
	        
	        x = x / 1000;
	        
	        
	        System.out.print("Input floating-point another number: ");
	     	        double y = in.nextDouble();
	        
	        y = y / 1000;

	        if (x == y)
	        {
	            System.out.println("They are the same up to three decimal places");
	        }
	        else
	        {
	            System.out.println("They are different");
	        }
	    
		
	}

}
