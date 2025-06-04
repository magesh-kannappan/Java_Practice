package a15_Remove_Duplicates;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Remove_Duplicates_Int_Array_Using_Collections {

	public static void main(String[] args) {

		int[] num = { 12, 11, 14, 12, 43, 22, 12, 32 };
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		
		for (int n : num) {
			set.add(n);
		}
		
		System.out.println(set.toString());

	}

}
