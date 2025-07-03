package a36_String_Character_Special_Separator;

import java.util.ArrayList;

public class String_Character_Special_Separator {

	public static void main(String[] args) {

		String given = "KisHoRE09/05/1997/03/07/2025";
		char[] givenArray = given.toCharArray();

		int upper = 0;
		int lower = 0;
		int number = 0;
		int spl = 0;

		StringBuffer uppercase = new StringBuffer();
		StringBuffer lowercase = new StringBuffer();
		StringBuffer numbers = new StringBuffer();
		StringBuffer splchars = new StringBuffer();
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		ArrayList<Integer> evenArray = new ArrayList<Integer>();
		ArrayList<Integer> oddArray = new ArrayList<Integer>();

		for (char ch : givenArray) {

			if (Character.isUpperCase(ch)) {
				uppercase.append(ch);
				upper++;
			}

			else if (Character.isLowerCase(ch)) {
				lowercase.append(ch);
				lower++;
			}

			else if (Character.isDigit(ch)) {

				numArray.add(ch - '0');
				numbers.append(ch);
				number++;
			} else {
				splchars.append(ch);
				spl++;
			}
		}

		// System.out.println(numArray.toString());

		for (Integer num : numArray) {
			if (num % 2 == 0) {
				evenArray.add(num);
			} else {
				oddArray.add(num);
			}
		}

		System.out.println("\nCharacters in the string" + "\n-------------------------");
		System.out.println("uppercase characters - " + uppercase.toString());
		System.out.println("Lowercase Characters - " + lowercase.toString());
		System.out.println("Numbers - " + numbers.toString());
		System.out.println("Special characters - " + splchars.toString());

		System.out.println("\nCharacters Count" + "\n------------------");
		System.out.println("Count of uppercase characters - " + upper);
		System.out.println("Count of lowercase characters - " + lower);
		System.out.println("Count of numbers - " + number);
		System.out.println("Count of special charcaters - " + spl);

		System.out.println("\nEven Numbers" + "\n------------------");
		System.out.println(evenArray.toString());

		System.out.println("\nOdd Numbers" + "\n------------------");
		System.out.println(oddArray.toString());

	}

}
