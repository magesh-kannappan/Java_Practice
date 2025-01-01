package looping_Statements;

import java.util.Scanner;

public class Do_While_Loop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start number");
		int start_No = scan.nextInt();

		System.out.println("Enter end number");
		int end_No = scan.nextInt();
		scan.close();

		do {
			System.out.println("asd");
			start_No++;
		} while (start_No >= end_No);
	}

}
