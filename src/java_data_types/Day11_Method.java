package java_data_types;

public class Day11_Method {

	public static void main(String[] args) {
		sample();
		hello();
		sum();
		add(8,5);
	}

	public static void sample() {
		System.out.println("Hello World");// methods without parameters
	}

	public static void hello() {
		System.out.println("Today we are learning methods");
	}

	public static void sum() {
		int a = 5;
		int b = 9;
		System.out.println(a + b);
	}
	//method with parameters
	public static void add(int a, int b) {
		System.out.println(a+b);
	}

}
