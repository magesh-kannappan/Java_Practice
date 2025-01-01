package string;

import java.security.DomainCombiner;
import java.util.Scanner;

public class Kfb {



	public void voter(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Name of the Voter");
		String name = scan.next();

		System.out.println("Age of the Voter:");
		int age = scan.nextInt();
		if(age>=18)
		{
			System.out.println(name +" You are eligible to vote");
		}
		else{
			System.out.println(name + "You are not eligible to vote");	
		}			
	}
	public static void main(String[] args) {
		
		Kfb vote = new Kfb();
		vote.voter();
	}
}



//	public static void main (String [] args){
//
//		String name = "Magesh";
//		byte age = 23;
//		long p_No = 81244979;
//		char ini_Name = 'K';
//		double weight = 7.0;
//		boolean married = false;
//		
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//		System.out.println("NAme");
//		String string = scan.next()
//		System.out.println(string);
//
//	}
//}

