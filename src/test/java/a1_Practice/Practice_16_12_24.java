package a1_Practice;

import java.util.Arrays;

public class Practice_16_12_24 {

	static String givenName = "Magesh";

	static int[] numbers = { 23, 87, 23, 33, 56 };

	public static void main(String[] args) {

		Practice_16_12_24 test = new Practice_16_12_24();
		// test.stringLength();
		// charArrayLength();
		// stringLengthUsingForLoop();
		// smallestNumberUsingArrayCollection();
		// smallestNumberUsingComparison();
		characterOccurence();
	}

	// Find Occurence of a character in the string array using For Loop

	static void characterOccurence() {

		String name = "Magesh Kannappan";
		char[] nameArray = name.toCharArray();
		char toFind = 'p';
		int occurence = 0;

		for (int i = 0; i < name.length(); i++) {

			if (nameArray[i] == toFind) {
				occurence++;
			}
		}
		System.err.println("Occurence of the given character - " + toFind + " is - " + occurence);
	}

	// Find the smallest number in an array

	static void smallestNumberUsingArrayCollection() {

		Arrays.sort(numbers);
		int smallest = numbers[0];
		System.out.println("Smallest number in an array - " + smallest);
	}

	static void smallestNumberUsingComparison() {

		int smallestValue = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallestValue) {
				smallestValue = numbers[i];
			}
		}
		System.out.println("Smallest number in an array - " + smallestValue);

	}

	// Finding Length of the String

	void stringLength() {

		int nameLength = givenName.length();
		System.err.println("String Length using default function - " + nameLength);
	}

	static void charArrayLength() {

		char[] nameArray = givenName.toCharArray();
		int nameLength = nameArray.length;
		System.err.println("String Length using charArray function - " + nameLength);
	}

	static void stringLengthUsingForLoop() {

		int charLength = 0;
		char[] nameArray = givenName.toCharArray();
		for (Character c : nameArray) {
			charLength++;
		}
		System.err.println("String Length using Foreach Loop function - " + charLength);

	}

}
