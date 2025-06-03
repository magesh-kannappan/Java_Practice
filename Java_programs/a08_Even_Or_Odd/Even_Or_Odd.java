package a08_Even_Or_Odd;

// Program to check each digit of a number and print whether it's Even or Odd

public class Even_Or_Odd {
	public static void main(String[] args) {

		// Input number
		int num = 12433; 

		// Loop to extract and check each digit from right to left
		while (num > 0) {

			// Get the last digit
			int lastDigit = num % 10;

			// Check if the digit is even or odd
			if (lastDigit % 2 == 0) {
				System.out.println(lastDigit + " is Even");
			} else {
				System.out.println(lastDigit + " is Odd");
			}

			// Remove the last digit
			num = num / 10;
		}
	}
}
