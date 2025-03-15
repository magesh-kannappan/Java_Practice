package a1_Java_Practice_March_2024;

public class Practice_15_03_25 {

	public static void main(String[] args) {

//		sentenceReverse();
		intReverse();

	}

	static void sentenceReverse() {

		String fullName = "Magesh Kannappan";
		String[] nameArray = fullName.split(" ");
		String reversed = "";

		for (int i = nameArray.length - 1; i >= 0; i--) {
			reversed = reversed + nameArray[i] + " ";
		}
		System.out.println(reversed);
	}

	static void characterReverse() {

		String givenString = "I Love India";
		String lowerGivenString = givenString.toLowerCase();
		char[] givenArray = lowerGivenString.toCharArray();
		String reversed = "";

		for (int i = givenArray.length - 1; i >= 0; i--) {
			reversed = reversed + givenArray[i];
		}

		System.out.println(reversed);
	}

	static void intReverse() {
		int givenNum = 12345;
		int reversedNum = 0;

		while (givenNum > 0) {
			givenNum = givenNum * 10;
			reversedNum = reversedNum + givenNum % 10;
			givenNum = givenNum / 10;
		}

		System.out.println(reversedNum);
	}

}
