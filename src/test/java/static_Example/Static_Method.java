package static_Example;

import java.util.Scanner;

public class Static_Method {

	public static void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = scan.nextInt();

		System.out.println("Enter 2nd number");
		int num2 = scan.nextInt();
		int ans = num1 + num2;

		System.out.println("The sum of 2 number is " + ans);
		scan.close();
	}

	public static void main (String [] args) {
		sum();

	}

}
