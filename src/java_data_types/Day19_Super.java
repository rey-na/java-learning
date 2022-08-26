package java_data_types;

class Phone1 {
	String make = "Apple";
	String color = "Black";
	void Hello() {
		System.out.println("This method is in Parent class");
	}
}

class smartphone extends Phone1 {
	String make = "Samsung";
	String color = "Red";
	void Hello() {
		System.out.println("This method is in Child class");
	}
// every time you have inheritance it will print constructors from parent and child class automatically
//without adding super ();
	void displayChildMake() {
		super.Hello();
		Hello();
		System.out.println("The phone is " + make);
		System.out.println("The color is " + color);
	}

	void displayParentMembers() {
		System.out.println("This will print parent members: " + super.make);
		System.out.println("This will print the color " + super.color);
	}
}

public class Day19_Super {

	public static void main(String[] args) {
		smartphone a = new smartphone();
		a.displayChildMake();
		a.displayParentMembers();

	}

}
