package a4_Number_Swap;

import java.util.Scanner;

public class Number_Swap_Using_Addition_Subtraction {

	public static void main(String[] args) {

		System.err.println(
				"Swapping two Numbers using Addition and Subtraction\n" + "-----------------------------------------");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Magesh Salary - ");
		int magesh_Salary = scan.nextInt();

		System.out.println("Enter Vinoth Salary - ");
		int vinoth_Salary = scan.nextInt();
		System.out.println("\nSalaries before Swapping: " + "\n-------------------------" + "\nMagesh Salary: "
				+ magesh_Salary + "\nVinoth Salary: " + vinoth_Salary);

		// first = first - second
		// second = first + second
		// first = second - first

		magesh_Salary = magesh_Salary - vinoth_Salary;
		vinoth_Salary = magesh_Salary + vinoth_Salary;
		magesh_Salary = vinoth_Salary - magesh_Salary;

		System.out.println("\nSalaries After Swapping: " + "\n-------------------------" + "\nMagesh Salary: "
				+ magesh_Salary + "\nVinoth Salary: " + vinoth_Salary);

	}

}
