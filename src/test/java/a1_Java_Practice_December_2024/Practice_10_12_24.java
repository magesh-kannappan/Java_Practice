package a1_Java_Practice_December_2024;

import java.util.Scanner;

public class Practice_10_12_24 {

	public static void main(String[] args) {

		// common_Elements_In_Array_Using_Nested_Loop();
		// stringLength();
		stringPalindrome();
	}

	void SumOfDigits() {
		int number = 12345; // Example number
		int sum = 0;

		// Use a loop to extract and add digits
		while (number > 0) {
			int digit = number % 10; // Get the last digit
			sum += digit; // Add it to the sum
			number /= 10; // Remove the last digit
		}

		System.out.println("Sum of the digits: " + sum);
	}

	private static void stringPalindrome() {

		System.out.println("Give the name to check its whether plaindrome");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		String org_Name = name;

		char[] chars = name.toCharArray();
		int loopCount = chars.length;

		String reversed = "";

		for (int i = loopCount - 1; i >= 0; i--) {
			reversed = reversed + chars[i];
		}
		System.out.println(reversed);

		if (org_Name.equals(reversed)) {
			System.out.println("Given name is an Palindrome - " + reversed);
		} else {
			System.err.println("Given name is not an Palindrome - " + reversed);
		}

	}

	public static void stringLength() {

		String name = "Magesh";
		System.out.println(name);

		int stringLength = name.length();
		System.out.println(stringLength);

		char[] chars = name.toCharArray();
		int charLength = chars.length;
		System.out.println(charLength);

		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			count++;
		}

		System.out.println("Final");
		System.out.println(count);

	}

	static void common_Elements_In_Array_Using_Nested_Loop() {

		String[] array1 = { "Hii", "Magesh", "Kannan", "Swetha" };
		String[] array2 = { "Chennai", "Magesh", "Swetha", "Kishore" };

		for (String array1Chars : array1) {
			for (String array2Chars : array2) {
				if (array1Chars.equals(array2Chars)) {
					System.out.println(array1Chars);
				}
			}
		}
	}

}
