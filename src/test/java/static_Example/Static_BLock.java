package static_Example;

public class Static_BLock {

	static {
		System.out.println("Static Block 1");
	}

	static {
		System.out.println("Static Block 2");
	}

	public static void main(String[] args) {

		System.err.println("Main Method");
	}
}
