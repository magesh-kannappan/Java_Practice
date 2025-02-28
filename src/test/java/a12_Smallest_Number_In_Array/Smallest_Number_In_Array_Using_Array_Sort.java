package a12_Smallest_Number_In_Array;

import java.util.Arrays;

public class Smallest_Number_In_Array_Using_Array_Sort {

	public static void main(String[] args) {

		int[] numbers = { 12, 72, 26, 58, 28, 32 };
		Arrays.sort(numbers);

		System.out.println("Smallest number in the array - " + numbers[0]);
		System.out.println("Largest number in the array - " + numbers[numbers.length - 1]);
		System.out.println("Third smallest number in the array - " + numbers[2]);
	}

}
