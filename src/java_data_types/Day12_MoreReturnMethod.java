package java_data_types;

public class Day12_MoreReturnMethod {

	public static void main(String[] args) {
		int sum = task();// 95
	
			System.out.println(sum);
			

	

		int sum2 = task2(4, 3);
		System.out.println(sum2);

		boolean a = isRaining();
		System.out.println(a);

	}
	
	public static boolean isRaining() {
		// TODO Auto-generated method stub
		return true;
	
	
	}
//non void method without parameters 
	// write a method which is going to return the sum of two values
	// which is a = 5 and b=90 if the mod is 0 we can print the sum is even number

	public static int task() {
		int a = 5;
		int b = 90;
		int sum = a + b;
		return sum;
	}

	public static int task2(int a, int b) {
		int sum = a + b;
		return sum;

	}

}
