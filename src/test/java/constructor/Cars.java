package constructor;

public class Cars {

	static String car_Brand;
	static String car_Model;

	Cars(String brand,String model){
		car_Brand = brand;
		car_Model = model;
	}
	public void car_Details() {
		System.out.println("car brand and Model is"+ car_Brand + car_Model);
	}

	public static void main(String[] args) {
		Cars c_Details = new Cars("Ford", "SUV");
		@SuppressWarnings("unused")
		Cars s_Details = new Cars("hum", "df");
		c_Details.car_Details();
	}
}


