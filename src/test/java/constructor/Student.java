package constructor;

// Default Constructor

public class Student {

	public void student_details() {
		Integer student_Id = 121263;
		String student_Name = "Magesh";
		System.out.println(student_Id);
		System.out.println(student_Name);
	}

	public static void main(String[] args) {
		Student object = new Student();
		object.student_details();
	}
}
