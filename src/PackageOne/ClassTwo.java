package PackageOne;

public class ClassTwo {
	public int a2=20;
	
	public static void main(String[]arg) {
		ClassOne c2= new ClassOne();
		c2.methodOne();
		System.out.println(c2.a1);
	}

	public static void methodTwo() {
		System.out.println("This is method 2.");
	}
}
