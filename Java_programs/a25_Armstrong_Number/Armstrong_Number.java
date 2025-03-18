package a25_Armstrong_Number;

public class Armstrong_Number {

	public static void main(String[] args) {

		int num = 153;
		int temp = num;
		int rem = 0;
		int sum = 0;

		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		System.out.print(sum + " ");

		if (num == temp) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not an armstrong");
		}
	}
}
