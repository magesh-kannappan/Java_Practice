package a1_Java_Practice_February_2025;

class Super {
    public int getLenght() {
        return 1;
    }
}

public class Test extends Super {
    public int getLenght() {  // Corrected method
        return 2;
    }

    public static void main(String[] args) {
        Super sooper = new Test();  // Upcasting
        Test test = new Test();

        System.out.println(sooper.getLenght() + "," + test.getLenght());
    }
}
