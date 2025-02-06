package a10_Replace_Vowels_With_Special_Chars;

public class Replace_Vowels_Using_For_Loop {

	public static void main(String[] args) {

		String name = "Magesh";
		String lower = name.toLowerCase();
		char specialChar = '#';

		char[] nameArray = lower.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < nameArray.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (nameArray[i] == vowels[j]) {
					nameArray[i] = specialChar;
				}
			}
		}

		for (char asd : nameArray) {
			System.out.print(asd);

		}

	}

}
