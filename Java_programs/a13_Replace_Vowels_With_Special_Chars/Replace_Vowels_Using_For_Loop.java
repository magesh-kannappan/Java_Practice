package a13_Replace_Vowels_With_Special_Chars;

import java.util.Arrays;

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

		System.out.println(Arrays.toString(nameArray));

		//		for (char asd : nameArray) {
		//			System.out.print(asd);
		//
		//		}

	}

}
