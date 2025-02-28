package a01_Sentence_Reverse;

public class Sentence_Reverse_Using_For_Loop {

	public static void main(String[] args) {

		String phrase = "India is my country";
		String lowerPhrase = phrase.toLowerCase();
		String[] phraseArray = lowerPhrase.split(" ");
		String reversedPhrase = " ";

		for (int i = phraseArray.length - 1; i >= 0; i--) {
			reversedPhrase = reversedPhrase + phraseArray[i] + " ";
		}

		System.out.println(reversedPhrase);
	}

}
