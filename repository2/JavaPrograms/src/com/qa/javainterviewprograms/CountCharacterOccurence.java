package com.qa.javainterviewprograms;

import java.util.Scanner;

/*java program to count the total number of occurrences of a given character in a string 
 without using any loop*/
public class CountCharacterOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:\n");
		String s = sc.nextLine();
		System.out.println("Enter the Character to count in the string:");
		String s1 = sc.nextLine();
		sc.close();
		
		//logic to count occurrences of a given character in a string
		
		int count = s.length() - s.replace(s1,"").length();
		
		System.out.println("Numberof Occurences of "+s1+" in your give string "+s+" is= "+count);

	}

}
