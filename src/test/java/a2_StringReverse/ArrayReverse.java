package a2_StringReverse;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {

		System.err.println("Reverse the String using Char Array\n" 
		+ "-----------------------------------\n");

		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a String to be Reversed: ");

		String userString = userInput.nextLine();
		System.out.println("\nUser enetered string is: " + userString + "\n");

		String reversed = "";

		char[] charArray = userString.toCharArray();
		int charlength = charArray.length;
		System.out.println("\nLength of he string : " + charlength + "\n");

		for (int i = charlength - 1; i >= 0; i--) {

			reversed = reversed + charArray[i];
		}

		System.err.println("\nString After Reversed: " + reversed);

	}

}
