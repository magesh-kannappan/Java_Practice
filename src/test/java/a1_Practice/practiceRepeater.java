package a1_Practice;

public class practiceRepeater {

	public static void main(String[] args) {

		practiceRepeater prac = new practiceRepeater();
		prac.reverseStringUsingBuffer();

	}

	private void reverseStringUsingBuffer() {

		String userInput = "Magesh";
		System.out.println("User given String: " + userInput);

		StringBuffer buffer = new StringBuffer();
		StringBuffer appendedString = buffer.append(userInput);
		System.out.println("Appended String: " + appendedString);

		StringBuffer reversedString = appendedString.reverse();
		System.out.println("Reversed String - " + reversedString);
	}
}
