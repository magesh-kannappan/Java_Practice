package a11_Find_Occurence_Of_Each_Character_In_String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Find_Occurence_Of_Each_Character_In_String {

	public static void main(String[] args) {

		String name = "India";
		String lowerCase = name.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		Integer count;

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char chars : charArray) {

			if (map.containsKey(chars)) {
				count = map.get(chars);
				map.put(chars, count + 1);

			} else {
				map.put(chars, 1);
			}
		}

		// System.out.println(map.toString());

		for (Map.Entry<Character, Integer> ch1 : map.entrySet()) {

			if (ch1.getValue() == 1) {
				Character key = ch1.getKey();
				System.out.println("First Non repetitive character in the given string is - " + key);
				break;
			}

		}

	}

}
