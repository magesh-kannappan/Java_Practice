package a28_String_Methods;

import java.util.Arrays;

public class String_Methods {

	public static void main(String[] args) {

		// Define two string variables
		String firstName = "Magesh Kannan";
		String lastName = "  Kannappan";

		// 1. Convert string to character array
		char[] charArray = firstName.toCharArray();
		System.out
		.println("1. toCharArray(): Converts the string into a character array: " + Arrays.toString(charArray));

		// 2. Concatenation of two strings
		System.out.println("2. concat(): Joins two strings: " + firstName.concat(lastName));

		// 3. Remove leading and trailing spaces (New in Java 11)
		System.out.println("3. strip(): Removes leading and trailing whitespace: '" + firstName.strip() + "'");

		// 4. Trim removes leading and trailing spaces (Older method)
		System.out.println(
				"4. trim(): Similar to strip(), removes leading and trailing spaces: '" + firstName.trim() + "'");

		// 5. Check if two strings are exactly equal
		System.out.println("5. equals(): Compares two strings for exact match: " + firstName.equals(lastName));

		// 6. Check if two strings are equal ignoring case sensitivity
		System.out.println("6. equalsIgnoreCase(): Compares two strings ignoring case differences: "
				+ firstName.equalsIgnoreCase(lastName));

		// 7. Repeat the string multiple times (New in Java 11)
		System.out.println("7. repeat(): Repeats the string 3 times: " + firstName.repeat(3));

		// 8. Split the string by space and convert to an array
		String[] nameArray = firstName.split(" ");
		System.out.println("8. split(): Splits the string into an array: " + Arrays.toString(nameArray));

		// 9. Check if a substring exists within the string
		System.out.println("9. contains(): Checks if 'Mag' is in the string: " + firstName.contains("Mag"));

		// 10. Check if the string is empty
		System.out.println("10. isEmpty(): Checks if the string is empty: " + firstName.isEmpty());

		// 11. Check if the string is blank (Java 11+)
		System.out.println("11. isBlank(): Checks if the string contains only whitespace: " + firstName.isBlank());

		// 12. Convert string to uppercase
		System.out.println("12. toUpperCase(): Converts the string to uppercase: " + firstName.toUpperCase());

		// 13. Convert string to lowercase
		System.out.println("13. toLowerCase(): Converts the string to lowercase: " + firstName.toLowerCase());

		// 14. Extract substring from index 3 onwards
		System.out.println("14. substring(3): Extracts substring from index 3: " + firstName.substring(3));

		// 15. Extract substring from index 3 to 6
		System.out.println("15. substring(3,6): Extracts substring from index 3 to 6: " + firstName.substring(3, 6));

		// 16. Get the index of a specific character ('g')
		System.out
		.println("16. indexOf('g'): Finds the index of the first occurrence of 'g': " + firstName.indexOf('g'));

		// 17. Get the index of a substring ("Kan")
		System.out.println("17. indexOf(\"Kan\"): Finds the index of the substring 'Kan': " + firstName.indexOf("Kan"));
	}
}
