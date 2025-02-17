package a06_StringLength;

import java.util.Scanner;

public class StringLenFun {

	public static void main(String[] args) {

		System.err.println("Find the length of the string\n" 
						 + "-----------------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the String to claculate the length");
		String usrString = scan.nextLine();
		
		int stringLen = usrString.length();
		System.err.println("\nLength of the String: " + stringLen);
	}

}
