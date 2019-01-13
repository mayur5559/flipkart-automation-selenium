package com.qa.javainterviewprograms;

import java.util.Scanner;

//find Palindrome number

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Palindrome :\n");
		int origNum = sc.nextInt();
		sc.close();
		int copyorigNum = origNum;
		int remainder;
		int temp = 0;
		
		while(origNum > 0)
		{
		    remainder = origNum % 10;
			
			origNum = origNum / 10;
			
            temp = temp	* 10 + remainder;		
			
		}
		if(temp==copyorigNum) 
		{
		    System.out.println("Palindrome");
		}
		else 
		{
			 System.out.println("Not Palindrome");
		}

	}

}
