package com.qa.javainterviewprograms;

import java.util.Scanner;

// Generate  Factorial Number
public class Factorial {

	public static void main(String[] args) {
		int fect = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int no = sc.nextInt();
		sc.close();
		if(no==0) 
		{
			System.out.println("Factorial of 0 is : " +no);
		}
		for(int i=1; i<=no; i++) 
		{
			fect = fect*i;
		}
		System.out.println("Factorial of "+no+" is : " +fect);

	}

}
