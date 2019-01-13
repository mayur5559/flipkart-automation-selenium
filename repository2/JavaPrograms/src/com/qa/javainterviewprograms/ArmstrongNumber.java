package com.qa.javainterviewprograms;

import java.util.Scanner;

//find Armstrong number

public class ArmstrongNumber {
	/*Armstrong number is a number that is the sum of its own digits each raised to 
	the power of the number of digits is equal to the number itself.
	Example:
	--->Three Digits Armstrong number is 153,( 1*1*1  + 5*5*5 + 3*3*3 = 153 )
	--->Four Digits Armstrong number is 1634,(1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4  = 1634) */

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int origNum = sc.nextInt();
		sc.close();
		int copyorigNum = origNum;
		int remainder;
		int armstrong = 0;
		while(origNum > 0)
		{
			remainder = origNum % 10;
			origNum   = origNum / 10;
			armstrong = armstrong + remainder*remainder*remainder;
		}
		if(armstrong == copyorigNum)
		{
			System.out.println("Armstrong Number");
		}
		else 
		{
			System.out.println("Not Armstrong Number");
		}

	}

}
