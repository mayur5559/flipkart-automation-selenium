package com.qa.javainterviewprograms;

import java.util.Scanner;

//program to find Prime number

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int no = sc.nextInt();
		sc.close();
		int i;
		
		if(no == 1)
		{
			System.out.println("Smallest Prime No is 2");
		}
        
		for(i=2; i<no; i++) 
		{
			if(no % i == 0)
			{
				System.out.println("Not Prime Number");
				break;
			}
			
		}
		if(no==i)
		{
			System.out.println("Prime Number");
		}
	}
	

}
