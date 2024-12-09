package a4_NumberSwap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArithmeticSwap {

	public static void main(String[] args) {

		ArithmeticSwap swap = new ArithmeticSwap();
		// swap.add_Sub_Swap();
		ArithmeticSwap.mul_Div_Swap();
	}

	private void add_Sub_Swap() {

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

	private static void mul_Div_Swap() {

		System.err.println("Swapping two Numbers using Multiplication and Division\n"
				+ "-----------------------------------------");

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

		magesh_Salary = magesh_Salary * vinoth_Salary;
		vinoth_Salary = magesh_Salary * vinoth_Salary;
		magesh_Salary = vinoth_Salary / magesh_Salary;

		System.out.println("\nSalaries After Swapping: " + "\n-------------------------" + "\nMagesh Salary: "
				+ magesh_Salary + "\nVinoth Salary: " + vinoth_Salary);
	}

}
