package a11_Find_Occurence_Of_Each_Character_In_String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Find_Occurence_Of_Each_Character_In_String {

	public static void main(String[] args) {

		// Input string
		String name = "India";

		// Convert to lowercase to treat characters like 'I' and 'i' as the same
		String lowerCase = name.toLowerCase();

		// Convert the string to a character array
		char[] charArray = lowerCase.toCharArray();

		// LinkedHashMap maintains insertion order
		LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();

		// Count occurrences of each character
		for (char ch : charArray) {
			if (frequencyMap.containsKey(ch)) {
				frequencyMap.put(ch, frequencyMap.get(ch) + 1);
			} else {
				frequencyMap.put(ch, 1);
			}
		}

		// Display all character frequencies (optional)
		System.out.println("Character Frequencies:");
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Find and print the first non-repeating character
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non-repetitive character is: " + entry.getKey());
				break;
			}
		}
	}
}
