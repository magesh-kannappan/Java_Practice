package a35_Replace_Repeated_With_Replace;

import java.util.HashSet;

public class ReplaceRepeatingCharacters {
	public static void main(String[] args) {
		String input = "Magesh Kannappan";
		StringBuilder output = new StringBuilder();
		HashSet<Character> seen = new HashSet<>();
		
		for (char ch : input.toCharArray()) {
			if (ch == ' ') {
				output.append(ch);
			} else if (seen.contains(ch)) {
				output.append('@');
			} else {
				seen.add(ch);
				output.append(ch);
			}
		}
		System.out.println("Output: " + output.toString());
	}
}
