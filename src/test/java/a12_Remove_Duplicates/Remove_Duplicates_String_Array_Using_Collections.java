package a12_Remove_Duplicates;

import java.util.LinkedHashSet;

public class Remove_Duplicates_String_Array_Using_Collections {

	public static void main(String[] args) {

		String[] names = { "Magesh", "Suresh", "Rajesh", "Kishore", "Kannan", "Magesh" };

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for (String n : names) {
			set.add(n);
		}

		System.out.println(set.toString());

	}

}
