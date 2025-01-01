package hierarchial_Inheritance;

public class Child_Kannappan extends Parent_Somasunadaram{

	public static void main(String[] args) {

		Child_Kannappan asset_Pull_Kannappan = new Child_Kannappan();
		System.out.println("\n"+"Kannappan Asset");
		System.out.println(asset_Pull_Kannappan.bike+"\n"+asset_Pull_Kannappan.acc_Bal);

		@SuppressWarnings("unused")
		Child_Rohini asset_Pull_Rohini = new Child_Rohini();
		System.out.println("\n"+"Rohini Asset");
		System.out.println(asset_Pull_Kannappan.acc_Bal);
	}
}
