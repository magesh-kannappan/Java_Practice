package a1_Java_Practice_March_2024;

public class MyClass {

	static {
		System.out.println("Static block");
	}

//	{
//		System.out.println("Instance block");
//	}

	public MyClass() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		MyClass obj1 = new MyClass();
//		MyClass obj2 = new MyClass();
		
		
		
	}
}
