package com.qa.javainterviewprograms;

import java.util.Scanner;
//java program to reverse a string
public class ReverseOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:\n");
		String str = sc.nextLine();
		sc.close();
		System.out.println("Given String Is = "+str);
	
		 
		//java string toCharArray() method converts the given string into a sequence of characters
		//It returns a newly allocated character array.
		
		char[] stringArray = str.toCharArray();
        
		// logic to reverse the string
		
		for(int index = stringArray.length-1; index >= 0 ; index--) {
             
			System.out.println(stringArray[index]);
			
	    }
  }  
}