package a35_Replace_Repeated_With_ReplaceMethod;

import java.util.HashMap;
import java.util.Map;

public class Replace_Repeated_With_ReplaceMethod {
	public static void main(String[] args) {
		String input = "Magesh M";
		String result = input;

		String buffer = new String();

		Map<Character, Integer> countMap = new HashMap<>();

		// Step 1: Count character frequency (excluding spaces)
		for (char ch : input.toCharArray()) {
			if (ch != ' ') {
				countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
			}
		}

		// Step 2: Replace repeated characters with '@'
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() ==1) {
				buffer = result.replace(entry.getKey(), '@');
			}
		}

		System.out.println("Output: " + buffer);
	}
}
