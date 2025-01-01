package overriding;

public class Son_Magesh extends Parent_Kannappan{

	public static void main(String[] args) {
		Parent_Kannappan asset = new Son_Magesh();
		asset.property();
		asset.marriage();
	}

	@Override
	protected void marriage() {
		//super.marriage();
		System.out.println("I love pranitha");
	}

}
