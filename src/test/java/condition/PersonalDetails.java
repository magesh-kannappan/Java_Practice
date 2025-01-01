package condition;

public class PersonalDetails {
	
	/*
	 *@author = Kerthana
	 *@Date = 22/08/2022
	 *@Description - 
	 * 
	 */
	
	static String firstName = "Magesh";
	static char lastName = 'K';
	
	byte age = 23;
	static short height = 172;
	int birthOfYear = 1999;
	long aadhaarNumber = 4072_4578_7895l;
	static float weight = 80.00f;
	double bmi = 25.8457;
	boolean married_Or_Unmarried = false;
	
	
	public static void myPersonal() 
	{
		System.out.println("Personal Details");
		System.out.println("----------------");
		System.out.println("\nMy name is - " + firstName + " " + lastName);
		System.out.println("My height and Weight - " + height +"cm & "+ weight +" Kg");
	}

	public static void main(String[] args) {
		
		PersonalDetails obj = new PersonalDetails();
		obj.myPersonal();
		
		PersonalDetails.myPersonal();
		
		// Printing Statement
		// Main Method
		// Variable Name
		// Method Creation
		// Object Creation
		// Concatination
		// Escape Sequences - /n /t /b
		// Static keyword using in method and vraibles
		// Naming Standards CAMEL and PASCAL
		// Single and Multi Line Comments
		// Primitive Data types
		
		
	}
	
}


