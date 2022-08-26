package java_data_types;

public class Day15_LocalVariable {
	//Global variable
	String day = "Monday";

	public static void main(String[] args) {
		//local variable
		int age=10;
		String name = "John";
		float temp =45.88f;
		System.out.println(age);
		System.out.println(name);
		System.out.println(temp);
		
		
		Day15_LocalVariable a = new Day15_LocalVariable();
		a.possible();
		
		if(true) {
			//local variable
			int b = 40;
					System.out.println(b);
		}

	}

	public static void possible() {
		// local variable
		String environment = "qa.codegator.us";
		String username = "testgoogle";
		String password = "Welcome";

		System.out.println(environment);
		System.out.println(username);
		System.out.println(password);

	}
}
