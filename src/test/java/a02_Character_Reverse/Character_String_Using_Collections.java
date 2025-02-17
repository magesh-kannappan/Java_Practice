package a02_Character_Reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Character_String_Using_Collections {

	public static void main(String[] args) {

		String userString = "Magesh";
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
