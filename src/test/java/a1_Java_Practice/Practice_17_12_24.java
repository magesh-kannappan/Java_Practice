package a1_Java_Practice;

public class Practice_17_12_24 {

	static String name = "Magesh";

	public static void main(String[] args) {

		// int occ = findingVowelUsingArray();z
		// System.out.println(occ);

		// findingVowelUsingReplace();
		// replaceVowelsWithSpecialCharacters();
		findElementInArray();
	}

	// Reverse the words in a sentence

	public static void reverseSentence() {

		String quote = "I LOVE MY COUNTRY";

	}

	// Find the element in the integer Array

	public static void findElementInArray() {

		int[] numArray = { 1, 4, 23, 54, 87 };
		int toCheck = 1;
		boolean numFound = false;
		int count = 0;
		int occurenceOfnum = 0;

		for (int nums : numArray) {
			if (nums == toCheck) {
				numFound = true;
				occurenceOfnum = count++;
			}
			// System.out.println(nums);
		}

		// System.out.println("Occurence of the num in the array - " + occurenceOfnum);

		if (numFound == true) {
			System.err.println("Number is present in the Array");
		} else {
			System.out.println("Number is not present in the Array");
		}

	}

	// Find the number of vowels in the given string

	static void findingVowelUsingReplace() {

		String replaced = name.replaceAll("[aeiou]", "%%%");
		System.out.println(replaced);
	}

	static void replaceVowelsWithSpecialCharacters() {

		String nameLowerCase = name.toLowerCase();
		char[] nameLowerCaseArray = nameLowerCase.toCharArray();
		int arrayLength = nameLowerCaseArray.length;

		char[] vowelArray = { 'a', 'e', 'i', 'o', 'u' };
		int vowelArrayLength = vowelArray.length;

		char specialCharacter = '*';

		for (int i = 0; i < arrayLength; i++) {
			for (int j = 0; j < vowelArrayLength; j++) {

				if (nameLowerCaseArray == vowelArray) {
					nameLowerCaseArray[i] = specialCharacter;
					char asd = nameLowerCaseArray[i];
				}
			}
		}
	}

	static int findingVowelUsingArray() {

		String nameLowerCase = name.toLowerCase();
		char[] nameLowerCaseArray = nameLowerCase.toCharArray();
		char[] vowelArray = { 'a', 'e', 'i', 'o', 'u' };
		int vowelOccurence = 0;

		for (char names : nameLowerCaseArray) {
			for (char vowel : vowelArray) {
				if (names == vowel) {
					// System.out.println("Vowel(s) present in the given string - " + vowel);
					vowelOccurence++;
				}
			}
		}
		// System.out.println(vowelOccurence++);
		return vowelOccurence;

	}

}
