package a06_Number_Swap;

import java.util.Scanner;

public class Number_Swap_Using_Third_Variable {

	public static void main(String[] args) {

		System.err.println("Swapping two Numbers using third variable\n" + "-----------------------------------------");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Magesh Salary - ");
		int magesh_Salary = scan.nextInt();

		System.out.println("Enter Vinoth Salary - ");
		int vinoth_Salary = scan.nextInt();
		System.out.println("\nSalaries before Swapping: " + "\n-------------------------" + "\nMagesh Salary: "
				+ magesh_Salary + "\nVinoth Salary: " + vinoth_Salary);

		int temp_Hand = magesh_Salary;
		magesh_Salary = vinoth_Salary;
		vinoth_Salary = temp_Hand;

		System.out.println("\nSalaries After Swapping: " + "\n-------------------------" + "\nMagesh Salary: "
				+ magesh_Salary + "\nVinoth Salary: " + vinoth_Salary);

	}

}
