package a1_Java_Practice_February_2025;

public class Practice_07_02_25 {

	public static void main(String[] args) {

		evenOrOdd();
	}

	public static void removeZero() {

	}

	public static void evenOrOdd() {

		int numbers = 1021323456;
		String stringNumbers = Integer.toString(numbers);
		char[] numArray = stringNumbers.toCharArray();

		for (char nums : numArray) {
			int numericValue = Character.getNumericValue(nums);
			if (numericValue == 0) {
				System.out.println("Number is zero - " + numericValue);
			} else if (numericValue % 2 == 0) {
				System.out.println("Number is even - " + numericValue);
			} else
				System.out.println("Number is Odd - " + numericValue);
		}
	}
}
