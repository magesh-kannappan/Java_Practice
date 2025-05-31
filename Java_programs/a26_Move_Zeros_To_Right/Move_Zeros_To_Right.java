package a26_Move_Zeros_To_Right;

import java.util.Arrays;

public class Move_Zeros_To_Right {

	public static void main(String[] args) {

		// Original array containing numbers including zeros
		int[] given = { 1, 2, 0, 4, 0, 4, 2, 2 };

		// New array to store result with zeros moved to the right
		int[] newArray = new int[given.length];

		// Index to track position for placing non-zero elements
		int newIndex = 0;

		// Loop through each element in the original array
		for (int i = 0; i < given.length; i++) {

			// If the current element is not zero, place it in newArray
			if (given[i] != 0) {
				newArray[newIndex] = given[i];
				newIndex++; // Move to next index for newArray
			}
		}

		// Print the final array with all zeros moved to the right
		System.out.println("Array after moving zeros to the right: " + Arrays.toString(newArray));
	}
}
