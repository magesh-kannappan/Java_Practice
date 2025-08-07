package a43_Sum_Numbers_In_String;

public class Sum_Numbers_In_String {

	public static void main(String[] args) {

		String input = "aa11b33";
		char[] inputArray = input.toCharArray();
		StringBuffer buffer = new StringBuffer();
		int sum = 0;

		for (char c : inputArray) {
			if (Character.isDigit(c)) {
				buffer.append(c); // Build up the number
			} else {
				if (buffer.length() > 0) {
					sum += Integer.parseInt(buffer.toString()); // Convert and add
					buffer.setLength(0); // Clear the buffer
				}
			}
		}

		// Check if a number remains at the end
		if (buffer.length() > 0) {
			sum += Integer.parseInt(buffer.toString());
		}

		System.out.println("Sum of numbers: " + sum);
	}

}
