package java_data_types;

public class Day15_StaticMethod {

	public static void main(String[] args) {
		method1();   // is able to access static method beacause value doesnt change
		//method2();   // cannot access nonstatic 
		
		Day15_StaticMethod aa = new Day15_StaticMethod();
		aa.method2(); //this is the way to access a nonstatic method by creating an object of class
		aa.method1();
		
		String bb = aa.method3();
		System.out.println("Hello");
		
	}

	public static void method1() {
		System.out.println("this is method1");

	}

	public void method2() {
		System.out.println("This is method2");

	}
	public String method3() {
		return "Hello";
	}
}
