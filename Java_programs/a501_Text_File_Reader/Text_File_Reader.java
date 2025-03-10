package a501_Text_File_Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text_File_Reader {

	public static void main(String[] args) throws IOException {

		String text = "";
		String[] splittedData = null;

		// Specify the file path
		String filePath = "C:\\Users\\NMSLAP511\\Downloads\\Test.txt";

		FileReader file = new FileReader(filePath);

		// Open file using BufferedReader
		BufferedReader reader = new BufferedReader(file);

		String line = "";
		int lineNumber = 0;

		// Read file line by line
		while ((line = reader.readLine()) != null) {
			lineNumber++;
			if (lineNumber == 2) { // Only print the 3rd line
				//				System.out.println(line);
				splittedData = line.split(",");
				break; // Stop reading after 3rd line
			}
		}

		System.out.println(splittedData[0]);

		// Close the reader
		reader.close();

	}

}
