package a30_Remove_Unwanted_Characters;

public class Remove_Unwanted_Characters {

	public static void main(String[] args) {
		
		String name = "Magesh !@#$%&*(*&";
		String replaceAll = name.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(replaceAll);
	}
}
