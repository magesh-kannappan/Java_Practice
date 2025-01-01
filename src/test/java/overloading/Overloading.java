package overloading;

public class Overloading {

	public void sum(int n1, int n2) {
		int ans = n1 +n2;
		System.out.println(ans);
	}

	public void sum(float n1, float n2, float n3) {
		float ans = n1+n2+n3;
		System.out.println(ans);
	}

	public static float sum(int n1, int n2, float n3) {
		float ans = n1+n2+n3;
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(Overloading.sum(1, 2, 2));

		Overloading sum_of = new Overloading();
		sum_of.sum(20, 20);

	}

}
