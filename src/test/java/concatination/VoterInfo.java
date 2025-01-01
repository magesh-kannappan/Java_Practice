package concatination;
import java.util.Scanner;

public class VoterInfo{

	public static void main (String [] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age - ");
		int age = scan.nextInt();

		if(age>=18){
			System.out.println("Congrats! you are elegible to vote");
		}
		else {
			System.err.println("Sorry you are not elegible");
		}
	}
}



