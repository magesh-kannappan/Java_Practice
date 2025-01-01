package multilevel_Inheritance;

public class Child_Kumari extends Parent_Divakaran {

	@SuppressWarnings("unused")
	private String gold_asset = "GOld";

	public static void main(String[] args) {

		Child_Kumari asset_Pull = new Child_Kumari();
		System.out.println(asset_Pull.account_Bal + "\n" + asset_Pull.post_Sav);
	}
}
