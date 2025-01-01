package multilevel_Inheritance;

public class Grand_Child_Kishore extends Child_Kumari {

	String asset = "HONDA DIO";

	public static void main(String[] args) {
		Grand_Child_Kishore asset_Pull = new Grand_Child_Kishore();
		System.out.println(asset_Pull.asset +"\n"+asset_Pull.post_Sav+"\n"+asset_Pull.account_Bal);
	}
}
