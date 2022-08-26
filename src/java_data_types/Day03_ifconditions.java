package java_data_types;

public class Day03_ifconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean c = 2 == 2;
		boolean b = c;
		if (b) {
			System.out.println("the value is 2");
		}
		System.out.println("After the if statement");
		int a = 30;
		if (a == 30) {
			System.out.println("the value of a is 30");
		} else {
			System.out.println("the value of a is not 30");
		}

		double m = 4.454545;
		double n = 2.232323;
		if (m == n) {
			System.out.println("that is right");
		} else {
			System.out.println("that is not right");
		}

		int b1= -6;
		if (b1 > 0) {
			System.out.println("The value is positive");
		} else {
			System.out.println("The value is negative");
		}

		int c1 = 0;
		if (c1 > 0) {
			System.out.println("The value is positive");
		} else if (c1 < 0) {
			System.out.println("the value is negative ");
		} else if (c1==0){
			System.out.println("The value is 0");}else {System.out.println("none");}
		char value = 'e';
		if (value == 'a') {
			System.out.println("The value is a");
		} else if (value == 'b') {
			System.out.println("The value is b");
		} else if (value == 'c') {
			System.out.println("The value is c");
		} else {
			System.out.println("The value is something else");}

			
				int x1 = 2;
				if (x1 == 1) {
					System.out.println("Today is Tuesday");
				} else if (x1 ==2) {
					System.out.println("Today is Wednesday");
					if (x1 ==3) {
						System.out.println("Today is Tuesday");
					} else if (x1 ==4) {
						System.out.println("Today is Wednesday");}
						else if (x1 ==5) {
							System.out.println("Today is Tuesday");
						} else if (x1 ==6) {
							System.out.println("Today is Friday");
				} else if (x1 ==7) {
					System.out.println("Today is Monday");
				} else {
					System.out.println("Wrong day");}
					}
				
	}}