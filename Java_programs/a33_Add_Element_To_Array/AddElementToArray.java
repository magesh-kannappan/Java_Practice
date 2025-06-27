// AddElementToArray.java
package a33_Add_Element_To_Array;


import java.util.Arrays;

public class AddElementToArray {

	public static void main(String[] args) {

		int[] age = {72, 23, 32, 45};
	    int[] newArray  = new int[age.length+1];
	    int index = 0;
	    
	    for(int i = 0; i<age.length; i++){
	        newArray[index] = age[i];
	        index++;
	    }    
	    
	    newArray[newArray.length-1] = 12;

	    System.out.println(Arrays.toString(newArray));
	  
	}
}
