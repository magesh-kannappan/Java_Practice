package static_Example;

public class Static_Variable {

	int stu_Rno;
	String stu_Name;
	static String stu_College = "DGVC";


	public void stu(int stu_R, String stu_N) {
		System.out.println("Roll number of the Student " + stu_R);
		System.out.println("Name of the student "+ stu_N);
		System.out.println("Student college name " + stu_College+"\n-------------------------");
	}

	public static void main(String[] args) {
		Static_Variable stu_Details = new Static_Variable();
		stu_Details.stu(1212, "Magesh");
		stu_Details.stu(1010, "kamal");

	}

}
