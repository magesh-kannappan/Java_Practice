package a20_String_Expander;

public class String_Expander {

	public static void main(String[] args) {

		String str = "M1a2g3e4s5h6";
		String lowerStr = str.toLowerCase();
		char[] strArray = lowerStr.toCharArray();
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < strArray.length; i = i + 2) {
			char letter = strArray[i];
			int digit = strArray[i + 1] - '0';

			for (int j = 0; j < digit; j++) {
				buffer.append(letter);
			}
		}
		System.out.println(buffer.toString());
	}

}
