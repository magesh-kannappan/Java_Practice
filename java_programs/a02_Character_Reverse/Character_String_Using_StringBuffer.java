package a02_Character_Reverse;

public class Character_String_Using_StringBuffer {

	public static void main(String[] args) {

		String userString = "Magesh";
		StringBuffer buffer = new StringBuffer();
		StringBuffer appendString = buffer.append(userString);
		StringBuffer reversedString = appendString.reverse();
		System.err.println("Reversed String: " + reversedString);
	}

}
