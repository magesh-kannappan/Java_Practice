package a1_Java_Practice_March_2024;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Properties;

public class Practice_12_03_25 {

	public static void main(String[] args) throws IOException {
		// TextFileReader();
		// sumNumbers();
		// palindromeNumber();
		// numberSwap();
		// additionNumberSwap();
		// stringLength();
		// countWords();
		// occurenceOfCharacter();
		// replaceVowels();
		// replaceVowels2();
		// occurenceOfEachCharacter();
		bubbleSort();

	}

	static void bubbleSort() {

		int[] nums = { 12, 32, 11, 866 };
		int temp;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[i] = temp;
				}
			}
		}

		String string = Arrays.toString(nums);
		System.out.println(string);

	}

	static void occurenceOfEachCharacter() {

		String name = "Magesh";
		char[] nameArray = name.toCharArray();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : nameArray) {
			if (map.containsKey(map)) {

				Integer count = map.get(ch);
				map.put(ch, count + 1);
			} else {
				map.put(ch, 1);
			}
		}

		System.out.print(map.toString());

	}

	static void replaceVowels2() {
		String name = "Magesh";
		char[] charArray = name.toCharArray();
		char spl = '%';

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' && charArray[i] == 'e' && charArray[i] == 'i' && charArray[i] == 'o'
					&& charArray[i] == 'u' && charArray[i] == 'A' && charArray[i] == 'E' && charArray[i] == 'I'
					&& charArray[i] == 'O' && charArray[i] == 'U') {

				charArray[i] = spl;
			}
		}
		for (char asd : charArray) {
			System.out.println(asd);
		}
	}

	static void replaceVowels() {

		String name = "Magesh";
		String replacedVowels = name.replaceAll("[aeiouAeiou]", "%");
		System.out.println(replacedVowels);

	}

	static void numberOfVowels() {

		String givenName = "Magesh";
		String lowerName = givenName.toLowerCase();
		char[] nameArray = lowerName.toCharArray();
		char[] vowelArray = { 'a', 'e', 'i', 'o', 'u' };
		int vowelCount = 0;
		String vowelPresent = "";

		for (int i = 0; i < nameArray.length; i++) {
			for (int j = 0; j < vowelArray.length; j++) {
				if (nameArray[i] == vowelArray[j]) {
					vowelPresent = vowelPresent + nameArray[i];
					System.out.println("Vowels present in the String - " + nameArray[i]);
					vowelCount++;
				}
			}
		}
		System.out.println("");
	}

	static void occurenceOfCharacter() {

		String name = "India";
		String lowerName = name.toLowerCase();
		char[] nameArray = lowerName.toCharArray();
		char toFind = 'n';
		int charCounter = 0;

		for (int i = 0; i < nameArray.length; i++) {

			if (toFind == nameArray[i]) {
				charCounter++;
			}
		}
		System.out.println("Character " + toFind + " is occured " + charCounter + " times.");

	}

	static void countWords() {

		String sent = "I love my country";
		String[] splittedSent = sent.split(" ");
		int wordCount = 0;

		for (String words : splittedSent) {
			wordCount++;
		}
		System.out.println(wordCount);

	}

	static void stringLength() {

		String name = "Magesh K";
		String spaceRemovedName = name.replace(" ", "");
		char[] nameArray = spaceRemovedName.toCharArray();
		int stringLength = 0;
		// String totalCharacters = "";

		for (int i = 0; i < nameArray.length; i++) {
			// totalCharacters = totalCharacters + nameArray[i];
			stringLength++;
		}

		System.out.println("String Length - " + stringLength);
	}

	static void additionNumberSwap() {

		int a = 100, b = 200;

		System.out.println("Before Swap - " + a + " " + b);

		a = a - b;
		b = a + b;
		a = a - b;

		System.out.println("After Swap - " + a + " " + b);
	}

	static void numberSwap() {

		int n1 = 100, n2 = 200, n3 = 0;

		System.out.println("Before Swap - " + n1 + " " + n2);

		n3 = n1;
		n1 = n2;
		n2 = n3;

		System.out.println("After Swap - " + n1 + " " + n2);

	}

	static void palindromeNumber() {

		int givenNum = 100;
		int orgNum = givenNum;
		int reversed = 0;

		while (givenNum > 0) {
			reversed = reversed * 10;
			reversed = reversed + givenNum % 10;
			givenNum = givenNum / 10;
		}

		if (orgNum == reversed) {
			System.out.println("Given number is a palindrome - " + orgNum);
		} else {
			System.err.println("Given number is not a palindrome - " + orgNum);
		}

	}

	static void propertyLoader() throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Eclipse Projects\\Personal Workspace\\Java_Practice\\Test.properties");
		Properties prop = new Properties();
		prop.load(file);
		System.out.println(prop.getProperty("browser"));

	}

	static void TextFileReader() throws IOException {

		String filepath = "C:\\Eclipse Projects\\Personal Workspace\\Java_Practice\\Test.txt";
		FileReader file = new FileReader(filepath);
		BufferedReader buffer = new BufferedReader(file);

		String line;

		int lineCount = 0;

		while ((line = buffer.readLine()) != null && lineCount == 1) {
			System.out.println(line);
			lineCount++;
		}

	}

	static void sumNumbers() {

		int num = 81;
		int lastDigit = 0;
		int total = 0;

		while (num > 0) {
			lastDigit = num % 10;
			total = total + lastDigit;
			num = num / 10;
		}

		System.out.println(total);
	}
}
