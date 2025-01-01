package single_Inheritance;

// Single Inheritance

public class Parent_kannappan {

	String immovable_Asset1 = "Ambattur_Land";
	private static String movable_Asset1 = "TVS_Auto";

	public static void main(String[] args) {

		Parent_kannappan asset_read = new Parent_kannappan();

		System.out.println(Parent_kannappan.movable_Asset1 + "\n" +asset_read.immovable_Asset1);
	}

}
