package a08_Even_Or_Odd;

public class Even_Or_Odd {

	public static void main(String[] args) {

		int num = 14785;

		while (num > 0) {

			int rem = num % 10;

			if (rem % 2 == 0) {
				System.out.println("The number is even");
			} else {
				System.out.println("The number is odd");
			}
		}
	}

}
