package com.qa.javainterviewprograms;

import java.util.Scanner;

// find number of digits in given number

public class NumOfDigits {

	public static void main(String[] args) {
		
		
		int count=0;
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Digit");
		int number = sc.nextInt();
		sc.close();
		
		//if the given no is less than 0
		if(number < 0)
		{
			number = number * -1;
		   
		}else if(number == 0) //if the given no is equal to 0
		 {
			number = 1;
		 }
		
		//if the given no is greater than 0
		while(number > 0) 
		{
			number = number/10;
			count++;
		}
		System.out.println("No of Digits in given number is = "+count);

	}

}
