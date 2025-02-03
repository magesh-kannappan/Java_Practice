package a1_Java_Practice_January_2025;

public class Practice_28_01_25 {

	public static void main(String[] args) {

		// smallestValue();
		// compareArray();
		sentenceReverse();
	}

	public static void sentenceReverse() {

		String role = "Automation Test Engineer";
		String[] splittedroles = role.split(" ");

		for (String temproles : splittedroles) {
			//			System.out.print(temproles);
		}

		StringBuffer reversed = new StringBuffer();

		for (int i = splittedroles.length - 1; i >= 0; i--) {
			reversed.append(splittedroles[i] + " ");
		}
		System.out.println(reversed);
	}

	// Find the common elements in an array

	public static void compareArray() {

		String[] names1 = { "Magesh", "Suresh", "Sing", "Rajesh" };
		String[] names2 = { "Dharun", "Suresh", "Rajesh" };

		for (String chars1 : names1) {
			for (String chars2 : names2) {
				if (chars1 == chars2) {
					System.out.println("Common elements in the array - " + chars1);
				}
			}
		}
	}

	public static void smallestValue() {

		// Find the smallest number using For Loop

		int[] numbers = { 2, 45, 21, 22 };
		int smallestValue = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallestValue) {
				smallestValue = numbers[i];
			}
		}
		System.out.println("The smallest value will be -" + smallestValue);
	}

}
