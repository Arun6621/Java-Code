package com.projectc.com;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		System.out.println("Input from user:");
		Scanner sc=new Scanner(System.in);
		String input=sc.next().toLowerCase();
		
		  boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
	        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
		
		 boolean vowels=input.equals("a") || input.equals("e") || input.equals("i")
	                || input.equals("o") || input.equals("u");
		 
		 if (input.length() > 1 )
	        {
	            System.out.println("Error");
	        } else if (!(uppercase || lowercase))
	            {
	                System.out.println("Error not a letter.");
	            
	       
	        }else if (vowels)
	            {
	                System.out.println("Input letter is Vowel");
	            }
	            else
	            {
	                System.out.println("Input letter is Consonant");
	            }
	        }
}
	
	
	
	
	

	        