package a1_Practice;

public class PracticeTest {

	private void ASD() {

		StringBuffer buff = new StringBuffer("Magesh");
		System.out.println(buff);
		System.out.println(buff.reverse());

	}

	private void stringasd() {

		String str = "   INDIA";

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		String strw = str.concat(" is my Country");
		System.out.println(strw);
		System.out.println(str.trim());

	}

	// Length of the number

	String asd = " World ";

	void lengthFinder() {

		System.out.println(asd.length());
		char[] charArray = asd.toCharArray();
		System.out.println(charArray.length);

		int length = 0;

		for (int i = 0; i < charArray.length; i++) {

		}
		System.out.println(length);

	}

	// Reverse the number

	int givennumber = 123;
	int reversedNumber = 0;

	private void reverse() {

		while (givennumber != 0) {
			reversedNumber = reversedNumber * 10;
			reversedNumber = reversedNumber + givennumber % 10;
			givennumber = givennumber / 10;
		}
		System.out.println(reversedNumber);
	}

	// Swap two numbers

	int magesh = 50;
	int vinoth = 100;
	int mani;

	public void sawpNumber() {

		System.out.println("Before Swapping");
		System.out.println(magesh);
		System.out.println(vinoth);

		mani = magesh;
		magesh = vinoth;
		vinoth = mani;

		System.out.println("After Swapping");
		System.out.println(magesh);
		System.out.println(vinoth);
	}

	String UserName = "Magesh";

	// Reverse a string

	public void UsingStringBuffer() {

		System.out.println("String before reversing (UsingStringBuffer) - " + UserName);
		StringBuffer buffer = new StringBuffer();
		StringBuffer appendedString = buffer.append(UserName);
		StringBuffer ReversedName = appendedString.reverse();
		System.out.println("String after reversing (UsingStringBuffer) - " + ReversedName);
	}

	public void UsingForLoop() {

		char[] charArray = UserName.toCharArray();
		String reversed = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed = reversed + charArray[i];
		}

		System.out.println(reversed);
	}

	public static void main(String args[]) {

		PracticeTest test = new PracticeTest();
		// test.UsingStringBuffer();
		// test.UsingForLoop();
		// test.sawpNumber();
		// test.reverse();
		//		test.lengthFinder();
		//		test.ASD();
		test.stringasd();
	}
}
