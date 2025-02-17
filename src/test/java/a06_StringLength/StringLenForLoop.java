package a06_StringLength;

import java.util.Scanner;

public class StringLenForLoop {

	public static void main(String[] args) {

		System.err.println("Find the length of the string\n" + "-----------------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the String to claculate the length");
		String usrString = scan.nextLine();

		char[] charArray = usrString.toCharArray();
		int length = 1;
		for (int i = 0; i < charArray.length; i++) {

		}

	}

}
