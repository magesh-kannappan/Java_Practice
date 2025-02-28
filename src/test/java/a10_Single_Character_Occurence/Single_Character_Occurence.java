package a10_Single_Character_Occurence;

public class Single_Character_Occurence {

	public static void main(String[] args) {

		String[] words = { "apple", "banana", "grape", "orange" };
		char target = 'a';
		int count = 0;

		for (String word : words) {
			for (char ch : word.toCharArray()) {
				if (ch == target) {
					count++;
				}
			}
		}

		System.out.println("Occurrence of '" + target + "' in the string array: " + count);

	}

}
