package a24_First_Non_Repititive_Character;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_Repititive_Character {

	public static void main(String[] args) {

		String str = "Swiss";
		String strLower = str.toLowerCase();
		char[] strArray = strLower.toCharArray();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char s : strArray) {

			if (map.containsKey(s)) {
				int count = map.get(s);
				map.put(s, count + 1);
			} else {
				map.put(s, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}

		System.out.println(map.toString());
		int nonRep = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				nonRep++;
				if (nonRep == 2) {
					System.out.println("Second non repeat - " + entry.getKey());
					return;
				}

			}

		}
	}
}
