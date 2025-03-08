package a23_Alternate_Case_Converter;

public class Alternate_Case_Converter {

	public static void main(String[] args) {

		String str = "ManiKandan";
		String lowerStr = str.toLowerCase();
		char[] strArray = lowerStr.toCharArray();

		for (int i = 0; i < strArray.length; i++) {
			if (i % 2 == 0) {
				char lower = Character.toLowerCase(strArray[i]);
				System.out.println(lower);
			} else {
				char upper = Character.toUpperCase(strArray[i]);
				System.out.println(upper);
			}
		}
	}
}
