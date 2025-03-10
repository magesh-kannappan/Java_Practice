package a26_Move_Zeros_To_Right;

import java.util.Arrays;

public class Move_Zeros_To_Right {

	public static void main(String[] args) {

		int[] given = { 1, 2, 0, 4, 0, 4, 2, 2 };
		int[] newArray = new int[given.length];
		int newIndex = 0;
		for (int i = 0; i < given.length; i++) {
			if (given[i] != 0) {
				newArray[newIndex] = given[i];
				newIndex++;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}

}
