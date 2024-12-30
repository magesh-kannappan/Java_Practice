package a6_String_Length;

import java.util.Scanner;

public class String_Length_Using_Character_Array_Function {

	public static void main(String[] args) {

		System.err.println("Find the length of the string\n" + "-----------------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the String to claculate the length");
		String usrString = scan.nextLine();

		char[] usrCharArray = usrString.toCharArray();
		int usrCharArrayLength = usrCharArray.length;
		System.out.println("String Length using Character Array Function - " + usrCharArrayLength);
	}
}
