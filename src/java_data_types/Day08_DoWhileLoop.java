package java_data_types;

public class Day08_DoWhileLoop {

	public static void main(String[] args) {
		int a = 0;
		do {
			System.out.println("Hello");
			a++;
		} while (a < 5);
		// the difference between do while loop is it runs once then checks the
		// condition if true runs if false stops
		// the while loop checks condition first if true runs, if false doesn't run
		
		do {
			System.out.println("Hello");
			if(a==5) {
			System.out.println("THe value of a is 5");
			break;
			}
			a++;
		} while (a < 5);
	}

}
