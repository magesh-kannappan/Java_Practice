package inheritance;

public class ParentClass {

	static String weirdName = "Magesh";

	static {
		System.out.println("Static Block 1");
	}

	static void magesh() {
		
	}

	void kishore() {
		magesh();
	}

	public static void main(String[] args) {

		System.out.println("Inside Main");
		Child1st.main(args);

	}

}
