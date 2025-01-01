package constructor;

// No Argument Constructor

public class Employee {

	Employee() {
		Integer emp_Id = 1212;
		String emp_Name = "Vikram";
		Character emp_Gender  = 'M';
		System.out.println("Employee name is " +emp_Name+" Employee ID is "+emp_Id + emp_Gender);
	}

	public static void main (String arga[]) {
		@SuppressWarnings("unused")
		Employee emp_Details = new Employee();
	}
}
