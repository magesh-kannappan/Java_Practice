package a1_Java_Practice_January_2025;

public class Practice_23_01_25 {

	public static void main(String[] args) {
		// Input string
		String str = "a3b2c0d4e2f3g0h2";

		// Output string builder
		StringBuilder result = new StringBuilder();

		// Iterate through the string
		for (int i = 0; i < str.length(); i = i + 2) {
			char letter = str.charAt(i); // Get the letter
			int number = Character.getNumericValue(str.charAt(i + 1)); // Get the number

			// Append the letter 'count' times to the result
			for (int j = 0; j < number; j++) {
				result.append(letter);
			}
		}

		// Print the final output
		System.out.println("Output: " + result.toString());
	}

}
