package java_data_types;

interface example {
	void test();

	void test2();

	void test3();

}

interface example3 extends example {
	void test4();
}

class example2 implements example3 { //,example3 if it wasnt extended  {
	public void test() {
		System.out.println("This is a test method");
	}

	public void test2() {
		System.out.println("This is a test2 method");
	}

	public void test3() {
		System.out.println("This is a test3 method");
	}

	@Override
	public void test4() {
	System.out.println("This is test4 method");
		
	}
}

public class Day21_Interface {

	public static void main(String[] args) {
		// example is an interface and example2 is a class and we created and object
		// indirectly
		example ex = new example2();
		ex.test();
		ex.test2();
		ex.test3();
		
		// direct way of creating an object
		example2 ex2 = new example2();
		ex2.test();
		ex2.test2();
		

		
				

	}

}
