package a39_Word_Extractor;

public class Word_Extractor {

	public static void main(String[] args) {

		String str = "asdbreadjambreadjkl";
		String[] parts = str.split("bread");
		String result = parts[1];
		System.out.println("Output: " + result);
	}
}
