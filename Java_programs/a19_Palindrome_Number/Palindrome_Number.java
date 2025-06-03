package a19_Palindrome_Number;

public class Palindrome_Number {

	public static void main(String[] args) {

		int num = 505;
		int org_Num = num;
		int reversed = 0;

		while (num > 0) {
			reversed = reversed * 10;
			reversed = reversed + num % 10;
			num = num / 10;
		}

		System.out.println(reversed);

		if (org_Num == reversed) {
			System.out.println("The number is a plaindrome");
		} else {
			System.out.println("The number is not a plaindrome");
		}

	}

}
