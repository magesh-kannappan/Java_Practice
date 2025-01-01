package abstract_Class;

import abstract_Interface.Ktm;

public class Poco extends Xiaomi implements Ktm{

	public static void main(String[] args) {

		Xiaomi poco = new Poco();
		poco.processor();
		poco.GorillaScreen();
		poco.gpu();

	}

	@Override
	public void engine() {
		Ktm.super.engine();
	}

	@Override
	public void diskasd() {
		System.out.println("disk");
	}	
	@Override
	void GorillaScreen() {
		System.out.println("Gorilla Screenn Viper");
	}

	@Override
	public void processor() {
		System.out.println("Mediatek 1100");		
	}

	@Override
	public void gpu() {
		System.out.println("Mali G78");
	}

}
