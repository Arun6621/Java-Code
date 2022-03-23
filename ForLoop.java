package com.projectc.com;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		
		int num=sc.nextInt();  
		 
		for(int i=1; i <= 12; i++)  
		{  
		      
		System.out.println(num+" * "+i+" = "+num*i);  
		}  
		}  
		}  