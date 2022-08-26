package java_data_types;

public class Day15_GlobalVariable {
	// global variable
	String phone = "iphone";
	String color = "black";
	static int memoria = 32;

	public static void main(String[] args) {
		Day15_GlobalVariable johns = new Day15_GlobalVariable();
		System.out.println(johns.phone);
		System.out.println(johns.color);
		System.out.println(johns.memoria);

		Day15_GlobalVariable Steves = new Day15_GlobalVariable();
		Steves.phone = "iphone13";
		Steves.color = "red";
		Steves.memoria = 64;

		System.out.println(Steves.phone);
		System.out.println(Steves.color);
		System.out.println(Steves.memoria);

		Day15_GlobalVariable mike = new Day15_GlobalVariable();
		System.out.println(mike.phone);
		System.out.println(mike.color);
		System.out.println(mike.memoria);

		Day15_GlobalVariable vin = new Day15_GlobalVariable();
		vin.possible();

	}

	public static void possible() {
		Day15_GlobalVariable vin = new Day15_GlobalVariable();
		vin.phone = "iphone12";
		vin.color = "blue";
		System.out.println(vin.phone);
		System.out.println(vin.color);
		System.out.println(vin.memoria);

	}
}
