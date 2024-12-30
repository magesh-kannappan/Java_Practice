package a1_Java_Practice;

public class Practice_18_12_24 {

	public static void main(String[] args) {

		palindromeStringOrNot();
	}

	// Check wether the given string is palindrome or not

	// Store the string in the variable
	// convert the string to lowercase
	//

	public static void palindromeStringOrNot() {
		String givenString = "Madam";
		String givenStringToLowerCase = givenString.toLowerCase();

		StringBuffer buffer = new StringBuffer();
		StringBuffer originalString = buffer.append(givenStringToLowerCase);
		System.out.println("User given string - " + givenString);

		StringBuffer reversedString = buffer.reverse();
		System.out.println("Reversed string - " + reversedString);

		if (originalString == reversedString) {
			System.out.println("Given string is an palindrome - " + originalString);
		}
	}

}
