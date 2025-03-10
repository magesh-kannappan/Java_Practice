package a502_Property_Loader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Loader {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Eclipse Projects\\Personal Workspace\\Java_Practice\\Test.properties");
		Properties prop = new Properties();
		prop.load(file);
		System.out.println(prop.getProperty("browser"));
	}

}
