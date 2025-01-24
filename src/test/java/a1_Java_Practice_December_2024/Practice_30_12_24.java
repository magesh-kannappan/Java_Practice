package a1_Java_Practice_December_2024;

import java.util.Scanner;

public class Practice_30_12_24 {

	public static void main(String[] args) {
		// numberPresent();
		stringPalindromeChecker();
	}
	
	
	
	
	

	// Check wether the given string is palindrome or not

	public static void stringPalindromeChecker() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name to check ");
		String givenName = scan.next();

		String originalName = givenName.toLowerCase();

		StringBuffer buffer = new StringBuffer(originalName);
		String reversedName = buffer.reverse().toString();

		if (originalName.equals(reversedName)) {
			System.out.println("The given name is an palindrome string");
		} else {
			System.err.println("The given name is not an palindrome string");
		}

	}

	// Find the number is present in the array or not

	static void numberPresent() {

		int[] numberArray = { 12, 23, 42, 455, 878 };
		int toCheck = 11;
		boolean isFound = false;

		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == toCheck) {
				isFound = true;
				break;
			}
		}

		if (isFound == true) {
			System.out.println("The given number is present in the array - " + toCheck);
		} else {
			System.err.println("The given number is not  in the array - " + toCheck);
		}

	}
}
