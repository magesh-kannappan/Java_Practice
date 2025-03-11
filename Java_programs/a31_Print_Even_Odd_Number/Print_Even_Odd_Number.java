package a31_Print_Even_Odd_Number;

public class Print_Even_Odd_Number {

	public static void main(String[] args) {

		System.out.println("Even numbers from 1 to 100: ");
		int evenCount = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenCount++;
				System.out.print(i + ",");
			}
		}
		System.out.println("\nNumber of even number between 1 to 100 - " + evenCount);

		System.out.println("\nOdd numbers from 1 to 100: ");
		int oddCount = 0;

		for (int j = 1; j <= 100; j++) {
			if (j % 2 != 0) {
				oddCount++;
				System.out.print(j + ",");
			}
		}
		System.out.println("\nNumber of even number between 1 to 100 - " + oddCount);

	}
}
