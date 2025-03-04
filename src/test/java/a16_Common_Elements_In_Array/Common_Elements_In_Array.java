package a16_Common_Elements_In_Array;

public class Common_Elements_In_Array {

	public static void main(String[] args) {

		String[] netmeds = { "Magesh", "Dharun", "Manikandan" };

		String[] fynd = { "Manoj", "Dharun", "Mani" };

		for (String n : netmeds) {
			for (String f : fynd) {
				if (n.equals(f)) {
					System.out.println("Same employees working in two of the companies are - " + n);
				}
			}
		}
	}
}
