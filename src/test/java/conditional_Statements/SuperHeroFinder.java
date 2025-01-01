package conditional_Statements;

// Else if Ladder

public class SuperHeroFinder {

	String hero_Name = "asd";

	public void hero_Finder() {
		if (hero_Name=="Super man") {
			System.out.println("Superman for India");
		} else if (hero_Name.equalsIgnoreCase("Bat man")) {
			System.out.println("Batman from Europe");
		} else if (hero_Name.equals("Magesh")) {
			System.out.println("Magesh from pakistan");
		}
		else {
			System.err.println("No heroes in the World");
		}
	}
	public static void main (String args[]) {
		SuperHeroFinder find = new SuperHeroFinder();
		find.hero_Finder();
	}
}
