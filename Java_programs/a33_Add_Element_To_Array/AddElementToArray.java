// AddElementToArray.java
package a33_Add_Element_To_Array;


import java.util.Arrays;

public class AddElementToArray {

	public static void main(String[] args) {

		// Original array
		int[] org = { 1, 2, 3 };

		// Create a new array with one additional length
		int[] des = new int[org.length + 1];

		// Copy elements from original array to new array
		for (int i = 0; i < org.length; i++) {
			des[i] = org[i];
		}

		// Add the new element (e.g., 4) at the last position
		des[des.length - 1] = 4;

		// Print the final array
		System.out.println(Arrays.toString(des));
	}
}
