package a1_Java_Practice_March_2024;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Practice_10_03_25 {

	public static void main(String[] args) throws IOException {
		TextFileReader();

	}

	static void propertyLoader() throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Eclipse Projects\\Personal Workspace\\Java_Practice\\Test.properties");
		Properties prop = new Properties();
		prop.load(file);
		System.out.println(prop.getProperty("browser"));

	}

	static void TextFileReader() throws IOException {

		String filepath = "C:\\Eclipse Projects\\Personal Workspace\\Java_Practice\\Test.txt";
		FileReader file = new FileReader(filepath);
		BufferedReader buffer = new BufferedReader(file);

		String line;

		int lineCount = 0;

		while ((line = buffer.readLine()) != null && lineCount == 1) {
			System.out.println(line);
			lineCount++;
		}
	}
}
