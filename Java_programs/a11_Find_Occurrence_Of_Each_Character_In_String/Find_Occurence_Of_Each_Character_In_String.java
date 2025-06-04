package a11_Find_Occurrence_Of_Each_Character_In_String;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This program finds the occurrence of each character in a string and
 * identifies the first non-repeating character.
 */
public class Find_Occurence_Of_Each_Character_In_String {

	public static void main(String[] args) {

		// Input string to process
		String input = "India";

		// Convert to lowercase to handle case insensitivity
		String normalizedInput = input.toLowerCase();

		// Convert string into a character array
		char[] characters = normalizedInput.toCharArray();

		// LinkedHashMap is used to maintain the order of characters
		LinkedHashMap<Character, Integer> charFrequencyMap = new LinkedHashMap<>();

		// Count frequency of each character
		for (char ch : characters) {
			if (charFrequencyMap.containsKey(ch)) {
				// If character already exists, increment its count
				charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
			} else {
				// Else, initialize count to 1
				charFrequencyMap.put(ch, 1);
			}
		}

		// Display character frequencies
		System.out.println("Character Frequencies:");
		for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Find and print the first non-repeating character
		for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("\nFirst non-repeating character: " + entry.getKey());
				break;
			}
		}
	}
}
