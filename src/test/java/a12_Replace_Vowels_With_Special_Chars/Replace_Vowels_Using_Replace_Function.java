package a12_Replace_Vowels_With_Special_Chars;

public class Replace_Vowels_Using_Replace_Function {

	public static void main(String[] args) {

		String name = "Automation_Test_Engineer";
		String lowerCase = name.toLowerCase();
		String replaceAll = lowerCase.replaceAll("[aeiou]", "#");
		System.out.println(replaceAll);
	}

}
