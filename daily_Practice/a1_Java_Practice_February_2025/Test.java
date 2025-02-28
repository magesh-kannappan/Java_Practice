package a1_Java_Practice_February_2025;

public class Test {

	static int sum;

	public static void main(String[] args) {

		int num = 73552;
		int seperatedNum = seperateLastDigit(num);
		int sum = digitSum(seperatedNum);

		System.out.println(sum);
	}

	public static int seperateLastDigit(int num) {
		num = num % 10;
		return num;
	}

	// sum of digits

	static int digitSum(int sepratedNum) {

		sum = sum + sepratedNum;
		return sum;
	}

	void removeLastDigit() {

		
	}

	//

}
