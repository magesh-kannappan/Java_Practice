package a2_String_Reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reverse_String_Using_Collections {

	public static void main(String[] args) {

		System.err.println("Reverse the String using Collections\n" + "-----------------------------------\n");

		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a String to be Reversed: ");

		String userString = userInput.nextLine();
		System.out.println("\nUser enetered string is: " + userString + "\n");

		String reversed = "";

		List<Character> stringList = new ArrayList<>();

		for (Character chars : userString.toCharArray()) {
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
