package a29_Scanner_Multiple_Data_Inputs;

import java.util.Scanner;

public class Scanner_Multiple_Data_Inputs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = scan.nextLine();

		System.out.println("Enter your age - ");
		int age = scan.nextInt();

		System.out.println("Enter your Weight - ");
		float weight = scan.nextFloat();

		System.out.println("Enter your BMI - ");
		double bmi = scan.nextDouble();

		System.err.println("\nCustomer Details\n----------------");
		System.out.println("Name - " + name);
		System.out.println("Age - " + age);
		System.out.println("Weight - " + weight);
		System.out.println("BMI - " + bmi);

		scan.close();
	}

}
