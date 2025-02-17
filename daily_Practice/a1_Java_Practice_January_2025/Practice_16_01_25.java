package a1_Java_Practice_January_2025;

public class Practice_16_01_25 {

	public static void main(String[] args) {
		stringReverseUsingForLoop();
	}

	public static void stringReverseUsingForLoop() {

		String name = "Magesh";
		String loweredName = name.toLowerCase();
		char[] namearray = loweredName.toCharArray();
		String reversed = "";

		for (int i = namearray.length - 1; i >= 0; i--) {
			reversed = reversed + namearray[i];
		}
		System.out.println(reversed);

	}
}
