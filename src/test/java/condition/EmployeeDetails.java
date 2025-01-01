package condition;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name - ");
		String empName = scan.nextLine();
		
		System.out.print("Enter your employee ID - ");
		int empId = scan.nextInt();
		System.out.println("Emp Name and ID - "+ empName+ " " + empId);





		//		System.out.println(empName);
		//		
		//		String empName1 = "Magesh";
		//		System.out.println(empName1);

	}
}
