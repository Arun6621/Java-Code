package com.projectc.com;

import java.util.Scanner;

public class Sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i,sum=0;
	    double avg;
	    {
	 
	        System.out.println("Enter any 5 numbers : ");  
	 
	    }
	        for (i=0;i<5;i++)
	        {
	            Scanner in = new Scanner(System.in);
	           int numbers = in.nextInt();
	 
	          sum=sum+numbers;
	    }
	    avg=sum/5;
	    System.out.println("The sum of 5 no is : " +sum+"\nThe Average is : " +avg);
	 
	}
	}
	