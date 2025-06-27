package a35_Replace_Repeated_With_Replace;

import java.util.HashMap;
import java.util.Map;

public class Replace_Repeated_With_ReplaceMethod {

	public static void main(String[] args) {
		String input = "Magesh M";
		String result = input;

		Map<Character, Integer> countMap = new HashMap<>();

		// Count character frequency (excluding spaces)
		for (char ch : input.toCharArray()) {
			if (ch != ' ') {
				countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
			}
		}

		// Replace repeated characters (count > 1) with '@'
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				result = result.replace(entry.getKey(), '@');
			}
		}

		System.out.println("Output: " + result);
	}
}
