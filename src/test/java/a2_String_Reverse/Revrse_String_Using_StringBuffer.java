package a2_String_Reverse;

import java.util.Scanner;

public class Revrse_String_Using_StringBuffer {

	public static void main(String[] args) {

		System.err.println("Reverse the String using String Buffer\n" 
						+ "---------------------------------------\n");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string need to be reversed: ");

		String userString = input.nextLine();// Read user input
		System.out.println("\nUser enetered string is: " + userString + "\n");

		StringBuffer buffer = new StringBuffer();
		StringBuffer appendString = buffer.append(userString);

		StringBuffer reversedString = appendString.reverse();
		System.err.println("Reversed String: " + reversedString);
	}

}
