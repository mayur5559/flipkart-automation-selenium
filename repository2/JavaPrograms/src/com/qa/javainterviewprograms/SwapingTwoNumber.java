package com.qa.javainterviewprograms;
import java.util.Scanner;
//Swap two integer variables without using third variable
public class SwapingTwoNumber {

	public static void main(String[] args) {
		//Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		 //before swap
		System.out.println("before Swap \n a is ="+a+"\n and \n b is ="+b);
		//Swaping without using third variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after Swap \n a is ="+a+"\n and \n b is ="+b);
		sc.close();
		
		

	}

}
