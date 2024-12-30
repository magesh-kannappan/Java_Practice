package a1_Java_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice_14_12_24 {

	static String givenString = "Magesh Kannappan";
	static String reversed = "";

	public static void main(String[] args) {

		System.out.println("Reverse the String\n");
		// stringReverseUsingStringBuffer();
		// stringReverseUsingCharArray();
		// stringReverseusingCollections();
		//		numberSwapUsingThirdVariable();
		numberSwapUsingaddSub();
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

	static void numberSwapUsingThirdVariable() {

		long mageshNumber = 8124497957l;
		long kishoreNumber = 9445837822l;
		long tempHand = 0l;

		System.err.println("Before Exchanging the numbers" + "\n");
		System.out.println("Magesh Number - " + mageshNumber);
		System.out.println("Kishore Number - " + kishoreNumber + "\n");

		tempHand = mageshNumber;
		mageshNumber = kishoreNumber;
		kishoreNumber = tempHand;

		System.err.println("After Exchanging the numbers" + "\n");
		System.out.println("Magesh Number - " + mageshNumber);
		System.out.println("Kishore Number - " + kishoreNumber);

	}

	// m=m-v
	// v=m+v
	// m=v-m

	private static void numberSwapUsingaddSub() {

		long mageshNumber = 8124497957l;
		long kishoreNumber = 9445837822l;

		mageshNumber = mageshNumber - kishoreNumber;
		kishoreNumber = mageshNumber + kishoreNumber;
		mageshNumber = kishoreNumber - mageshNumber;

		System.err.println("After Exchanging the numbers" + "\n");
		System.out.println("Magesh Number - " + mageshNumber);
		System.out.println("Kishore Number - " + kishoreNumber);

	}

}
