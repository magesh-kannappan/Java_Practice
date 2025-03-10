package a21_Sentence_Character_Reverse;

public class Sentence_Character_Reverse {

	public static void main(String[] args) {

		String str = "Magesh Kannappan";
		String lowerName = str.toLowerCase();
//		String reversed = "";

		char[] revArray = lowerName.toCharArray();
		String revWord = "";

		for (int j = revArray.length - 1; j >= 0; j--) {
			revWord = revWord + revArray[j];
		}
		System.out.println(revWord);

//		String[] strArray = revWord.split(" ");
//
//		for (int i = strArray.length - 1; i >= 0; i--) {
//			reversed = reversed + strArray[i] + " ";
//		}
		
//		System.out.println(revWord);

	}

}
