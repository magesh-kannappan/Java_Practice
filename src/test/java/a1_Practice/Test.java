package a1_Practice;

public class Test {

	public static void main(String[] args) {

		// Test.usingStringBuffer();
		Test.UsingCharArray();

	}

	private static void usingStringBuffer() {
		String givenString = "India";
		StringBuffer buffer = new StringBuffer(givenString);
		StringBuffer reversed = buffer.reverse();
		System.out.println(reversed);
	}

	private static void UsingCharArray() {

		String givenString = "India";
		System.out.println("Given String - " + givenString);
		String reversed = "";

		char[] array = givenString.toCharArray();
		int arraylength = array.length;
		
		char[] arr = new char[5] ;
		
		
		
		// System.out.println(arraylength - 1);
		// System.out.println(array[4]);

//		for (int i = array.length - 1; i >= 0; i--) {
//			// System.out.println("Reversed:" + array[i]);
//			reversed = reversed + array[i];
//			System.out.println("Inside Loop - " + reversed);
//		}
//		System.out.println("Outside Loop - " + reversed);
	}
}
