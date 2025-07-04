package a37_Alphabetical_Key_Map_Sorter;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Alphabetical_Key_Map_Sorter {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("null", 2);
		map.put("apple", 4);
		map.put("orange", 3);

		// Using TreeMap to sort by key
		Map<String, Integer> sortedMap = new TreeMap<>(map);

		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
