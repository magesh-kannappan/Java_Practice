package a06_StringLength;

import java.util.Scanner;

public class String_Length_Using_For_Each_Loop {

	public static void main(String[] args) {

		System.err.println("Find the length of the string\n" + "-----------------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the String to claculate the length");
		String usrString = scan.nextLine();

		int charLength = 0;
		char[] nameArray = usrString.toCharArray();
		for (Character c : nameArray) {
			charLength++;
		}
		System.err.println("\nString Length using Foreach Loop function - " + charLength);
	}

}
