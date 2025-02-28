package a12_String_Numerical_replacing;

public class String_Numerical_replacing {

	public static void main(String[] args) {

		String givenString = "a3b2c0d4e2f3g0h2";

		for (int i = 0; i < givenString.length(); i = i + 2) {
			Character letters = givenString.charAt(i);
			System.out.println(letters);
			int numbers = Character.getNumericValue(givenString.charAt(i+1) );
			System.out.println(numbers);
		}
	}

}
