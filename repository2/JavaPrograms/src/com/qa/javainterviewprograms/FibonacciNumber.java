package com.qa.javainterviewprograms;

import java.util.Scanner;

public class FibonacciNumber {

	
	//Fibonacci series is in the form of 0, 1, 1, 2, 3, 5, 8, 13, 21,…… 
	//0+1=1, 1+1=2, 2+1=3, 3+2=5, 5+3=8, 8+5=13, 13+8=21........and so on.......
	public static void main(String[] args) {
		
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the number of term for series:\n");
       int number = sc.nextInt();
       sc.close();
       int first = 0;
       int second = 1;
       int next;
       
       System.out.println("Fabonacci serise till: "+number);
       for(int i = 0 ; i < number; i++) 
       {
    	      System.out.println(first);
    	      
    	      next   = first + second;
    	      first  = second;
    	      second = next;
    	      
       }
       
       
       
	}

}
