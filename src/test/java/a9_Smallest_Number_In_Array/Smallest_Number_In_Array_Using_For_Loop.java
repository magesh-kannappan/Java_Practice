package a9_Smallest_Number_In_Array;

public class Smallest_Number_In_Array_Using_For_Loop {

	public static void main(String[] args) {

		int[] numbers = { 12, 72, 26, 58, 28, 32 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
