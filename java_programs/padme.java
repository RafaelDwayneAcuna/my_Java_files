package training;

import java.util.Scanner;

public class padme {
	
	public static boolean isPalindrome(String s) {
		
		s = s.toLowerCase();
		
		StringBuilder sb = new StringBuilder(s);
		
		String reversed = sb.reverse().toString();
		
		return s.equals(reversed);
		
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a word to check if it is a palindrome: ");
		String theword = sc.nextLine().toLowerCase();
		
		if(isPalindrome(theword) == false) {
			System.out.println("The word is not a palindrome");
		}else if(isPalindrome(theword) == true) {
			System.out.println("The word is a palindrome");
		}else {

		}

		
		sc.close();
		//System.out.println(isPalindrome("LeveL"));
		//System.out.println(isPalindrome("Radar"));
		//System.out.println(isPalindrome("Racecar"));
		//System.out.println(isPalindrome("Hello"));
		//System.out.println(isPalindrome("LOL"));
		

	}
	


}
