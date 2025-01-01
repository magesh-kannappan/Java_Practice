package looping_Statements;

// While Loop

import java.util.Scanner;

public class While_Loop {

	public static void main (String [] args) {

		Scanner input_No = new Scanner(System.in);
		System.out.println("Enter a start Number");
		int start_No = input_No.nextInt();

		System.out.println("Enter a Ending Number");
		int end_No = input_No.nextInt();
		input_No.close();

		while (start_No <= end_No)
		{
			System.out.println(start_No);
			start_No++;
		}

	}
}
