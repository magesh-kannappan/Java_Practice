package a36_Reverse_Characters_Except_Digits;

public class Reverse_Characters_Except_Digits {

	public static void main(String[] args) {

		String input = "a1b2c3d4e5";
		StringBuilder output = new StringBuilder();

		String replacedInput = input.replaceAll("[^a-zA-Z]", "");
		System.out.println(replacedInput);
		
		char[] letters = replacedInput.toCharArray();
		int index = letters.length - 1;

		for (char ch : input.toCharArray()) {
			if (Character.isLetter(ch)) {
				output.append(letters[index--]);
			} else {
				output.append(ch);	
			}
		}

		System.out.println(output.toString());
	}

}
