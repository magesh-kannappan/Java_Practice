package a1_Java_Practice_January_2025;

public class SentenceAndCharacterReverse {

	public static void main(String[] args) {

		String sentence = "Hello World this is Java";
		String[] words = sentence.split(" ");
		String reversedSentence = "";

		for (int i = words.length - 1; i >= 0; i--) {
			reversedSentence = reversedSentence + reverseString(words[i]) + " ";
		}

		System.out.println("Reversed Sentence with Reversed Words: " + reversedSentence.trim());
	}

	private static String reverseString(String word) {
		String reversed = "";
		for (int j = word.length() - 1; j >= 0; j--) {
			reversed += word.charAt(j);
		}
		return reversed;
	}
}
