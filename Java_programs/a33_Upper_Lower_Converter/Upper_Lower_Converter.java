package a33_Upper_Lower_Converter;

public class Upper_Lower_Converter {

	public static void main(String[] args) {

		String name = "Magesh Kannappan";
		char[] nameArray = name.toCharArray();

		for (int i = 0; i < nameArray.length; i++) {

			if (Character.isUpperCase(nameArray[i])) {
				char upper = Character.toLowerCase(nameArray[i]);
				System.out.print(upper);
			} else if (Character.isLowerCase(nameArray[i])) {
				char lower = Character.toUpperCase(nameArray[i]);
				System.out.print(lower);
			}

		}

	}
}
