package conditional_Statements;

// if-else Statement

public class Voter_Eligibility {

	String voter_Name = "Magesh";
	Integer voter_Age = 18;

	public void Vote_Finder() {
		if (voter_Age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		} 
	}
	public static void main(String args[]) {
		Voter_Eligibility check = new Voter_Eligibility();
		check.Vote_Finder();
	}
}

