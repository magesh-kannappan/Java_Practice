package a03_Integer_Reverse;

public class Integer_Reverse {

	public static void main(String[] args) {

		int userInt = 221;
		int reverse = 0;

		while (userInt != 0) {
//			reverse = reverse * 10;
//			reverse = reverse + userInt % 10;
			userInt = userInt / 10;
		}

//				System.err.println("\nNumber after Swap: " + reverse);
				System.err.println("\nNumber after Swap: " + userInt);

	}

}
