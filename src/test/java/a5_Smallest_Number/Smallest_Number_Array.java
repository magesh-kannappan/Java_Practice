package a5_Smallest_Number;

public class Smallest_Number_Array {

	public static void main(String[] args) {

		{

			int[] arr = { 100, 55, 101, 12, 0 };
			int min = arr[0];
			System.out.println(min);
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
					System.out.println(min);
				}
			}
			System.out.println("The minimum number is " + min);
		}
	}

}
