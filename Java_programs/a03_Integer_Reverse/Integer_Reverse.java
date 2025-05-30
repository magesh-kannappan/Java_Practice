package a03_Integer_Reverse;

public class Integer_Reverse {

	public static void main(String[] args) {
		
		// Declare the integer to be reversed
		int userInt = 221;

		// Variable to store the reversed number
		int reverse = 0;

		// Loop runs until userInt becomes 0
		while (userInt != 0) {
			
			// Multiply the existing reverse by 10 to shift digits to the left
			reverse = reverse * 10;

			// Add the last digit of userInt to reverse
			reverse = reverse + userInt % 10;

			// Remove the last digit from userInt
			userInt = userInt / 10;
		}

		// Print the reversed number using System.out instead of err
		System.out.println("Reversed Number: " + reverse);
	}

}
