package abstract_Class;

public class Redmi extends Xiaomi {

	public static void main(String[] args) {

		Xiaomi pro = new Redmi();
		pro.GorillaScreen();
		pro.processor();
		pro.gpu();
	}

	@Override
	void GorillaScreen() {
		System.out.println("Victus Gorilla Screen");
	}

	@Override
	public void processor() {
		System.out.println("Snapdragon 778");
	}

	@Override
	public void gpu() {
		System.out.println("Adreno GPU 234");
	}
}

