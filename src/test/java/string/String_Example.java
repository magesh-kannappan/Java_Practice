package string;

public class String_Example {

	public static void main(String[] args) {

		String f_name = "Magesh";
		String l_name = "M";

		int n = 0;

		System.out.println(n+1 + " Character String");
		char charAt = f_name.charAt(2);
		System.out.println(charAt);

		System.out.println(n+1 + " Upper case");
		String upperCase = f_name.toUpperCase();
		System.out.println(upperCase);

		String lowerCase = f_name.toLowerCase();
		System.out.println(lowerCase);

		String trim = f_name.replace('g','h');
		System.out.println(trim);

		String replace = f_name.replace("esh","asd");
		System.out.println(replace);

		boolean equals = f_name.equals("Magesh");
		System.out.println(equals);

		boolean equalsIgnoreCase = f_name.equalsIgnoreCase("MAhESH");
		System.out.println(equalsIgnoreCase);

		String concat = f_name.concat("Kannappan");
		System.out.println(concat);

		boolean contains = f_name.contains("M");
		System.out.println(contains);

		int indexOf = f_name.indexOf("M");
		System.out.println(indexOf);

		int indexOf2 = f_name.indexOf(3);
		System.out.println(indexOf2);

		String intern = f_name.intern();
		System.out.println(intern);

		boolean startsWith = f_name.startsWith("M");
		System.out.println(startsWith);

		boolean endsWith = f_name.endsWith("k");
		System.out.println(endsWith);

		boolean empty = f_name.isEmpty();
		System.out.println(empty);

		boolean blank = l_name.isBlank();
		System.out.println(blank);




		//		StringBuffer bfr_name = new StringBuffer("Kishore");
		//		System.out.println(bfr_name);
		//
		//		bfr_name.append("Kannappan");
		//		System.out.println(bfr_name);
		//		bfr_name.append(20);
		//		System.out.println(bfr_name);
		//
		//		bfr_name.append("\n"+ 8124497);
		//		System.out.println(bfr_name);
		//
		//		String sd = new String("father");
		//		System.out.println(sd);
		//
		//		StringBuilder fg = new StringBuilder("ushgfcyagc");
		//		System.out.println(fg);

		//		String name1 = "Magesh" ;
		//		System.out.println(name1);
		//
		//		name1 = "kishore";
		//		System.out.println(name1);


	}
}


