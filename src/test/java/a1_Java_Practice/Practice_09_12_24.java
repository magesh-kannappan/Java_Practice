package a1_Java_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice_09_12_24 {

	public static void main(String[] args) {

		// SwappingNumbersUsingThirdVariable();

		Practice_09_12_24 test = new Practice_09_12_24();
		// test.stringReverseUsingBuffer();
		// StringReverseUsingForLoop();
		// numberSwapUsingThirdVariable();
		// numberSwapping();
		// smallest();
		//		numberSwapping1();
		StringReverseUsingCollection();
	}

	public static void StringReverseUsingCollection() {

		String given = "Swetha";
		char[] chars = given.toCharArray();

		List<Character> charArrayList = new ArrayList<>();

		for (char c : chars) {
			charArrayList.add(c);
		}

		Collections.reverse(charArrayList);

		StringBuilder reversedString = new StringBuilder();
		for (char c : charArrayList) {
			reversedString.append(c);
		}

		System.out.println("Reversed String: " + reversedString.toString());

	}

	private static void numberSwapping1() {

		int m = 40000;
		int v = 20000;

		System.out.println("Before Swap");
		System.out.println(m);
		System.out.println(v);

		m = m - v;
		v = m + v;
		m = v - m;

		System.out.println("After Swap");

		System.out.println(m);
		System.out.println(v);

	}

	public static void smallest() {

		System.out.println("Magesh");

		int[] arr = { 1, 23, 45, 0, 80 };
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				;
			min = arr[i];
		}
		System.out.println(min);

	}

	private static void numberSwapping() {

		int mageshSalary = 40000;
		int swethaSalary = 20000;

		try {
			mageshSalary = mageshSalary * swethaSalary;
			System.out.println(mageshSalary);
			swethaSalary = mageshSalary % swethaSalary;
			System.out.println(swethaSalary);
			mageshSalary = mageshSalary / swethaSalary;
			System.out.println(mageshSalary);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Magesh ");
		}
	}

	static void numberSwapUsingThirdVariable() {

		int mageshSalary = 40000;
		int swethaSalary = 20000;
		int kishoreHand;

		kishoreHand = mageshSalary;
		mageshSalary = swethaSalary;
		swethaSalary = kishoreHand;
		kishoreHand = 0;

		System.out.println("Magesh - " + mageshSalary);
		System.out.println("Swetah - " + swethaSalary);
		System.out.println(kishoreHand);

	}

	public static void StringReverseUsingForLoop() {

		String given = "Magesh";
		char[] chars = given.toCharArray();
		int charCount = chars.length;
		String reverse = "";

		for (int i = charCount - 1; i >= 0; i--) {
			reverse = reverse + chars[i];
		}

		System.out.println(reverse);

	}

	public void stringReverseUsingBuffer() {

		String givenString = "Magesh";
		System.out.println("Before Reverse - " + givenString);

		StringBuffer buffer = new StringBuffer(givenString);
		StringBuffer reversedString = buffer.reverse();
		System.out.println("After Reverse - " + reversedString);

	}

	public static void SwappingNumbersUsingThirdVariable() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Input the two salaries need to be swapped");

		System.out.println("Input the 1st Salary");
		int salary1 = scan.nextInt();

		System.out.println("Input the 2nd Salary");
		int salary2 = scan.nextInt();

		int tempHand = 0;

		// Swapping Logic using Temp Variable

		System.out.println("Before Swapping the salary");
		System.out.println(salary1);
		System.out.println(salary2);

		tempHand = salary1;
		salary1 = salary2;
		salary2 = tempHand;

		System.out.println("After Swapping the salary");
		System.out.println(salary1);
		System.out.println(salary2);

	}

}
