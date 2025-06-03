package a05_Palindrome_String;

public class Palindrome_String {

	public static void main(String[] args) {

		String name = "MOM";
		String lowerName = name.toLowerCase();
		String org_Name = lowerName;
		System.out.println(org_Name);
		char[] nameArray = lowerName.toCharArray();
		String reversed = "";
		for (int i = nameArray.length - 1; i >= 0; i--) {
			reversed = reversed + nameArray[i];
		}

		System.out.println(reversed);

		if (org_Name.equals(reversed)) {
			System.out.println("Given String is a palindrome");
		} else {
			System.out.println("Given String is not a palindrome");
		}

	}

}
