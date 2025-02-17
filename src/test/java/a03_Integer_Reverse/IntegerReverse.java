package a03_Integer_Reverse;

import java.util.Scanner;

public class IntegerReverse {

	public static void main(String[] args) {

		System.err.println("Number Reverse \n" + "--------------");

		System.out.println("Enter the number to be reversed: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int userInt = scan.nextInt();
		System.out.println("\nNumber before Swap: " + userInt);

		int reverse = 0;

		// Logic
		while (userInt != 0) {
			reverse = reverse * 10;
			reverse = reverse + userInt % 10;
			userInt = userInt / 10;

		}

		System.err.println("\nNumber after Swap: " + reverse);

	}

}
