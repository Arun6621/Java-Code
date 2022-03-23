package com.projectc.com;

import java.util.Scanner;

public class Farenheittocelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Farenheit:");
		Scanner sc=new Scanner(System.in);
	float F=sc.nextFloat();
		
		float Celsius = ((F-32)*5)/9  ;
				System.out.println	("Temperature in Celsius is: "+Celsius);  

	}

}
