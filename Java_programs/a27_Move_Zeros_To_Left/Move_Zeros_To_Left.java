package a27_Move_Zeros_To_Left;

import java.util.Arrays;

public class Move_Zeros_To_Left {

    public static void main(String[] args) {

        // Input array with some zero and non-zero values
        int[] given = { 1, 0, 2, 0, 4, 0, 5, 6 };

        // New array to hold the final result
        int[] result = new int[given.length];

        // Index to insert non-zero elements starting from the end
        int index = result.length - 1;

        // Traverse the input array from end to start
        for (int i = given.length - 1; i >= 0; i--) {
            if (given[i] != 0) {
                result[index] = given[i];
                index--;  // Decrease index for next non-zero placement
            }
        }

        // Print the modified array
        System.out.println("Array after moving zeros to the left: " + Arrays.toString(result));
    }
}
