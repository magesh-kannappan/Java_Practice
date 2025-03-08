package a19_Remove_Duplicates;

import java.util.HashSet;

public class Remove_Duplicates_String {

	public static void main(String[] args) {

		String[] names = { "Magesh", "Suresh", "Rajesh", "Kannan", "Dharun", "Magesh" };

		HashSet<String> nameList = new HashSet<String>();

		for (String name : names) {
			nameList.add(name);
		}

		System.out.println(nameList.toString());

	}

}
