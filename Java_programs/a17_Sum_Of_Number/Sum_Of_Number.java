package a17_Sum_Of_Number;

public class Sum_Of_Number {

	public static void main(String[] args) {
		int num = 113;
		int sum = 0;
		int lastDigit;

		while (num > 0) {

			lastDigit = num % 10;
			sum = sum + lastDigit;
			num = num / 10;
		}
		System.out.println(sum);
	}
}