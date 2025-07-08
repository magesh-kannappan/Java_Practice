package a23_Alternate_Case_Converter;

public class Invert_Case_Converter {

	public static void main(String[] args) {

		String name = "Magesh Kannappan";
		char[] nameArray = name.toCharArray();
		StringBuilder output = new StringBuilder();

		for (Character ch : nameArray) {
			if (Character.isUpperCase(ch)) {
				char lower = Character.toLowerCase(ch);
				output.append(lower);
			} else if (Character.isLowerCase(ch)) {
				char upper = Character.toUpperCase(ch);
				output.append(upper);
			} else if (ch == ' ') {
				output.append(ch);
			}
		}

		System.out.println(output.toString());

	}

}
