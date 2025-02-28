package a12307_Find_Vowels;

public class Find_Vowels_Present_In_String {

	public static void main(String[] args) {

		String name = " Magesh ";
		String lowerName = name.trim().toLowerCase();
		char[] nameArray = lowerName.toCharArray();
		System.out.println(lowerName);

		String vowels = "AeIoU  ";
		String lowerVowels = vowels.trim().toLowerCase();
		char[] vowelArray = lowerVowels.toCharArray();
		System.out.println(lowerVowels);

		int vowelCount = 0;
		String replacedName = "";

		for (int i = 0; i < lowerName.length(); i++) {
			for (int j = 0; j < lowerVowels.length(); j++) {
				if (nameArray[i] == vowelArray[j]) {
					vowelCount++;
					System.out.println("Vowel(s) is present in index positions of the given name - " + i);
					nameArray[i] = '*';
				}
			}
		}

		for (char replaced : nameArray) {
			replacedName = replacedName + replaced;
		}
		System.out.println("Replaced with Special Character - " + replacedName);

		System.out.println("Total number of vowel Present in the given name - " + vowelCount);
	}

}
