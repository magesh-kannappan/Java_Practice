package a35_Replace_Repeated_With_Replace;

import java.util.HashSet;

public class ReplaceRepeatingCharacters {
	public static void main(String[] args) {
		// Input string to process
		String input = "Magesh Kannappan";

		// StringBuilder is used to build the final result efficiently
		StringBuilder output = new StringBuilder();

		// HashSet to keep track of characters that have already appeared
		HashSet<Character> seen = new HashSet<>();

		// Loop through each character in the input string
		for (char ch : input.toCharArray()) {

			// If the character is a space, we keep it as-is
			if (ch == ' ') {
				output.append(ch);
			}
			// If we've already seen this character before, replace it with '@'
			else if (seen.contains(ch)) {
				output.append('@');
			}
			// If it's the first time we're seeing this character, add it to the result and
			// mark as seen
			else {
				seen.add(ch); // Mark this character as seen
				output.append(ch); // Append the original character
			}
		}

		// Print the final result
		System.out.println("Output: " + output.toString());
	}
}
