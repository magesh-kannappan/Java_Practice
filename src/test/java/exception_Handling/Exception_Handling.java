package exception_Handling;

public class Exception_Handling {

	// Null pointer Exception
	String name;

	public static void main(String[] args) {

		try {
			Exception_Handling asd = new Exception_Handling();
			System.out.println("Start ");
			//System.out.println(asd.name.length());
			//System.exit(5);
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println("This is Arithmetic");
		}
		catch (NullPointerException w) {
			System.out.println("this is null");
		}
		finally {
			System.out.println("End of the Code");
		}
	}

}
