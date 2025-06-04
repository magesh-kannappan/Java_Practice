package a19_String_Length;

public class String_Length_Using_Character_Array_Function {

	public static void main(String[] args) {

		System.err.println("Find the length of the string\n" + "-----------------------------");

		String usrString = "Swetha";

		char[] usrCharArray = usrString.toCharArray();
		int usrCharArrayLength = usrCharArray.length;
		System.out.println("String Length using Character Array Function - " + usrCharArrayLength);
	}
}
