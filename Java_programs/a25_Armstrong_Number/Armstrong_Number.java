package a25_Armstrong_Number;

public class Armstrong_Number {

	public static void main(String[] args) {

		int num = 153; // Define the number to check
		int originalNum = num;
		int sum = 0;
		int digits = String.valueOf(num).length(); // Count digits

		while (num > 0) {
			int digit = num % 10; // Extract last digit
			sum += Math.pow(digit, digits); // Add digit^power
			num /= 10; // Remove last digit
		}

		// Check if the sum is equal to the original number
		if (sum == originalNum) {
			System.out.println(originalNum + " is an Armstrong number.");
		} else {
			System.out.println(originalNum + " is not an Armstrong number.");
		}
	}
}
