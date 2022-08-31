package java_data_types;

class Example1 {
	final int a = 10;
	final String api = "FWO757473";

	 final void methodOne() {
		System.out.println("This is methodOne from example1 class" + a);
	}/*
		 * if you have a final keyword with the class you cannot perform inheritance if
		 * you have a final keyworkd with the variable you cannot re_initialize a new
		 * value if you hava a final keyword with the method you cannot perform
		 * overriding
		 */

}

class Example4 {

	public void methodOne() {
		
		
	}

}

public class Day28_Final {

	public static void main(String[] args) { 
		Example1 ex = new Example1();
		ex.methodOne();

	}

}
