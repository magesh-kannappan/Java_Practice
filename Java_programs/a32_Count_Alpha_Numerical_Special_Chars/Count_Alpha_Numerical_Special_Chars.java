package a32_Count_Alpha_Numerical_Special_Chars;

public class Count_Alpha_Numerical_Special_Chars {

	public static void main(String[] args) {

		String str = "Magesh@1999";
		char[] strArray = str.toCharArray();
		int letterCounter = 0;
		int digitCounter = 0;
		int splCounter = 0;

		for (int i = 0; i < strArray.length; i++) {

			if (Character.isLetter(strArray[i])) {
				//				System.out.println("Letter - " + strArray[i]);
				letterCounter++;

			} else if (Character.isDigit(strArray[i])) {
				//				System.out.println("Digit - " + strArray[i]);
				digitCounter++;
			} else {
				//				System.out.println("Special Character - " + strArray[i]);
				splCounter++;
			}
		}

		System.out.println(letterCounter);
		System.out.println(digitCounter);
		System.out.println(splCounter);

	}

}
