package a38_Numeric_Prefix_Extractor;

public class Numeric_Prefix_Extractor {

	public static void main(String[] args) {

		String input = "MRP10,000";
		String numericPart = input.replaceAll("[^0-9,]", "");
		String[] parts = numericPart.split(",");
		int result = Integer.parseInt(parts[0]);
		System.out.println("Output: " + result);
	}
}
