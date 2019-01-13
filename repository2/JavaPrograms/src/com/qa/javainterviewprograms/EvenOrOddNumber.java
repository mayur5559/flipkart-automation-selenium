package com.qa.javainterviewprograms;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int no = sc.nextInt();
		sc.close();
        
		if(no % 2 == 0) 
		{
			System.out.println("Number "+no+" is even");
		}
		else 
		{
			System.out.println("Number "+no+" is odd");
		}
	}

}
