package com.qa.javainterviewprograms;

import java.util.Scanner;

//count the number of words in a string

public class CountTheWordsInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:\n ");
		String s = sc.nextLine();
		sc.close();
		
		int count = 1;
		
		for(int i =0 ; i < s.length() - 1 ; i++) 
		{
		
			if((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) 
			{
		
		               count++;
			}
	    }
        System.out.println("Number OF Words In The String = "+count);
  }
}
