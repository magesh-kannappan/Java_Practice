package a1_Practice;

public class practiceRepeater {

	public static void main(String[] args) {

		practiceRepeater prac = new practiceRepeater();
		// prac.reverseStringUsingStringBuffer();
		// prac.reverseStringUsingForLoop();
		// prac.swapnumber();
		//		prac.swapnumberusingAdd();
		prac.swapnumberusingMul();

	}

	private void reverseStringUsingStringBuffer() {

		String givenText = "India";
		StringBuffer buffer = new StringBuffer();
		StringBuffer Appended = buffer.append(givenText);
		StringBuffer reversed = Appended.reverse();
		System.out.println(reversed);
	}

	private void reverseStringUsingForLoop() {

		String givenText = "Magesh";
		String reverse = "";
		char[] charArray = givenText.toCharArray();
		int length = charArray.length;

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + charArray[i];
		}
		System.out.println(reverse);
	}

	private void swapnumber() {

		int user1 = 10;
		int user2 = 100;
		int tempHand = 0;

		System.out.println("Before");
		System.out.println(user1);
		System.out.println(user2);

		tempHand = user1;
		user1 = user2;
		user2 = tempHand;

		System.out.println("After");
		System.out.println(user1);
		System.out.println(user2);

	}

	private void swapnumberusingAdd() {

		int a = 10;
		int b = 100;

		System.out.println("Before");
		System.out.println(a);
		System.out.println(b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After");
		System.out.println(a);
		System.out.println(b);

	}

	private void swapnumberusingMul() {

		int a = 1000;
		int b = 10000;

		System.out.println("Before");
		System.out.println(a);
		System.out.println(b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After");
		System.out.println(a);
		System.out.println(b);

	}

}
