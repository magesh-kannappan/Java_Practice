package a1_Practice;

public class Practice_11_12_24 {

	public static void main(String[] args) {

		// Find the smallest number in an array

		int[] numberArray = { 0, 3, 1, 986, 23 };
		int arrayLength = numberArray.length;
		int minimum = Integer.MAX_VALUE;
		int mostMinimum;

		for (int i = 0; i <= arrayLength-1; i++) {
			if (numberArray[i] != 0) {
				if (numberArray[i] < minimum) {
					mostMinimum = numberArray[i];
					System.out.println(mostMinimum);
				}
			} else {
				System.out.println("Smallest number is zero");
			}
		}
	}

}
