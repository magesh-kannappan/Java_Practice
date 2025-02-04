package a1_Java_Practice_February_2025;

import java.util.Scanner;

public class Practice_03_02_25 {

	static String name = "Swethan";

	public static void main(String[] args) {

		// Length of the string
		// stringLengthUsingForLoop();

		// int nameLength = stringLengthUsingForEachLoop();
		// System.out.println("Length of the given string - " + nameLength);

		// Practice_03_02_25 test = new Practice_03_02_25();
		// test.stringLengthUsingInbuiltFunction();

		// characterReverseUsingStringBuffer();

		// characterReverseUsingForLoop();

		sentenceReverseUsingForLoop("Automation Test Engineer");

	}

	public static void stringLengthUsingForLoop() {

		String name = "Magesh";
		int nameLength = 0;

		for (int i = 0; i < name.length(); i++) {
			name.charAt(i);
			nameLength++;
		}
		System.out.println("Length of the given string - " + name + " and Length - " + nameLength);
	}

	public static int stringLengthUsingForEachLoop() {

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		int nameCount = 0;
		char[] nameArray = name.toCharArray();
		for (Character chars : nameArray) {
			nameCount++;
		}
		return nameCount;
	}

	public void stringLengthUsingInbuiltFunction() {

		int length = name.length();
		System.out.println("Length calculation using inbuilt function - " + length);
	}

	// Reverse the sentence

	public static void characterReverseUsingStringBuffer() {

		StringBuffer buff = new StringBuffer(name);
		StringBuffer reverse = buff.reverse();
		System.out.println(reverse);
	}

	public static void characterReverseUsingForLoop() {

		String reversed = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reversed = reversed + name.charAt(i);
		}
		System.out.println(reversed);
	}

	public static void sentenceReverseUsingForLoop(String sentence) {

		String[] splittedString = sentence.split(" ");
		String reversed = "";

		for (int i = splittedString.length - 1; i >= 0; i--) {
			reversed = reversed + " " + splittedString[i];
		}
		System.out.println(reversed);
	}

	public static void characterReverseInsideSentenceReverse(String sentence) {

		
		
	}
}
