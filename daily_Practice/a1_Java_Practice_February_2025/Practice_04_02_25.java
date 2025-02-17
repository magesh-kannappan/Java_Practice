package a1_Java_Practice_February_2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_04_02_25 {

	// Find the number of vowels in the given string

	public static void main(String[] args) {

		//		smallestNumberInArray();

		int[] array = { 3, 2, 1 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

	private void jdsncf() {

		List<String> nameList = new ArrayList<String>();
		nameList.add("Magesh");
		nameList.add("Vignesh");
		nameList.add("Suresh");
		nameList.add("Rajesh");

		int size = nameList.size();
		System.out.println(size);

		System.out.println(nameList.indexOf("Rajesh"));

		nameList.clear();
		System.out.println(nameList);

	}

	public static void vowelCounter() {

		String name = "aeiou";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		int vowelCount = 0;

		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < vowels.length; j++)
				if (name.charAt(i) == vowels[j]) {
					vowelCount++;
				}
		}
		System.out.println(vowelCount);
	}

	// Find the smallest number in the array

	public static void smallestNumberInArray() {

		int[] numbers = { 10, 30, 20, 50, 40 };

		Arrays.sort(numbers);

		int smallestNumber = numbers[0];
		int largestNumber = numbers[numbers.length - 1];
		int thirdLargestNumber = numbers[3];

		System.out.println(smallestNumber);
		System.out.println(largestNumber);
		System.out.println(thirdLargestNumber);

	}

}
