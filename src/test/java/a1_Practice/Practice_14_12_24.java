package a1_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice_14_12_24 {

	static String givenString = "Magesh Kannappan";
	static String reversed = "";

	public static void main(String[] args) {

		System.out.println("Reverse the String\n");
		stringReverseUsingStringBuffer();
		stringReverseUsingCharArray();
		stringReverseusingCollections();
	}

	// Reverse the string

	public static void stringReverseUsingStringBuffer() {

		StringBuffer buffer = new StringBuffer(givenString);
		StringBuffer reversedString = buffer.reverse();
		System.err.println("String Reversed using String Buffer Class - " + reversedString + "\n");
	}

	static void stringReverseUsingCharArray() {

		char[] charArray = givenString.toCharArray();
		for (int index = charArray.length - 1; index >= 0; index--) {
			reversed = reversed + charArray[index];
		}
		System.err.println("String Reversed using character array - " + reversed + "\n");
	}

	static void stringReverseusingCollections() {

		List<Character> stringList = new ArrayList<>();

		for (Character chars : givenString.toCharArray()) {
			stringList.add(chars);
		}

		Collections.reverse(stringList);

		StringBuffer reveresedBufferString = new StringBuffer();
		for (Character reversedchar : stringList) {
			reveresedBufferString.append(reversedchar);
		}

		reversed = reveresedBufferString.toString();
		System.err.println("String Reversed using Collections - " + reversed);
	}

}
