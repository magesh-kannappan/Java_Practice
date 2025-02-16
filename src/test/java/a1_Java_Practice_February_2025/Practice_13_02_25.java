package a1_Java_Practice_February_2025;

public class Practice_13_02_25 {

	public static void main(String[] args) {

		// Find the occurence of each character in the given String

		//		int[] numArray = { 1, 123, 111, 23, 42, 123 };
		//		Arrays.sort(numArray);
		//		for (int nums : numArray) {
		//			System.out.println(nums);
		//		}

		AscendingOrder();
	}

	// temp = i;
	//
	//

	public static void AscendingOrder() {

		int[] numArray = { 1, 123, 111, 23, 42, 123 };

		for (int i = 0; i < numArray.length; i++) {
			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] < numArray[j]) {

					int temp = numArray[j];
					numArray[j] = numArray[i];
					numArray[i] = temp;
				}
			}
			System.out.println(numArray[i]);
		}

	}
}
