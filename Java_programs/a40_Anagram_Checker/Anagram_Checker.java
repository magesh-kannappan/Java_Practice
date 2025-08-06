package a40_Anagram_Checker;

import java.util.Arrays;

public class Anagram_Checker {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";

		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		} else {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			if (Arrays.equals(arr1, arr2)) {
				System.out.println(str1 + " and " + str2 + " are anagrams.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagrams.");
			}
		}
	}
}
