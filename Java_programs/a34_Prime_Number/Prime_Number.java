package a34_Prime_Number;

public class Prime_Number {

	public static void main(String[] args) {

		int num = 4; // Change this number to test others
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(num + (isPrime ? " is a Prime Number" : " is NOT a Prime Number"));

	}

}
