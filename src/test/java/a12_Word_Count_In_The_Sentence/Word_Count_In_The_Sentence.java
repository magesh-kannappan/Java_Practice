package a12_Word_Count_In_The_Sentence;

public class Word_Count_In_The_Sentence {

	public static void main(String[] args) {

		String paragraph = "India is my country";
		String[] splittedPara = paragraph.split(" ");
		int count = 0;
		for (String words : splittedPara) {
			count++;
		}
		System.out.println("Word count in the paragraph - " + count);
	}
}
