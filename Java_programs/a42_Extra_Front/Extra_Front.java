package a42_Extra_Front;

public class Extra_Front {

	public static void main(String[] args) {

		String str = "Hello";
		String front;

		if (str.length() >= 2) {
			front = str.substring(0, 2);
		} else {
			front = str;
		}

		String result = front + front + front;
		System.out.println(result);
	}
}
