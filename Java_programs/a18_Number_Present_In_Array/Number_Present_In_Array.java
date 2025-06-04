package a18_Number_Present_In_Array;

import java.util.Scanner;

public class Number_Present_In_Array {

	public static void main(String[] args) {

		int[] num = { 72, 55, 32, 27, 12 };

		System.out.println("Enter the number to check in the array");
		Scanner scan = new Scanner(System.in);
		int numToFind = scan.nextInt();

		for (int n : num) {
			if (n == numToFind) {
				System.out.println("Given number is present in the array - " + numToFind);
			}
		}
	}

}
