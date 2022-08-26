package java_data_types;

public class Day09_Arrays {

	public static void main(String[] args) {
		int a; // declare the variable
		a = 5; // initialize variable

		// int[] rollNumber; // declare an array variable
		// rollNumber = new int[5];

		int[] _rollNumber = new int[5];
		_rollNumber[0] = 500;
		_rollNumber[1] = 300;
		_rollNumber[2] = 100;
		_rollNumber[3] = 400;
		_rollNumber[4] = 200;
		System.out.println(_rollNumber[3]);

		String[] sdnames = new String[4];
		sdnames[0] = "John";
		sdnames[1] = "Mary";
		sdnames[2] = "April";
		sdnames[3] = "Julius";
		System.out.println(sdnames[0]);

		int[] num1 = { 100, 200, 300, 400, 500 };
		System.out.println(num1[2]);

		String[] sdnames1 = { "Al", "TJ", "Mary", "Thomas", "Julius" };
		System.out.println(sdnames1[2]);
		System.out.println(sdnames1.length);
		System.out.println(sdnames.length);
		
		//loop ex
		for(int i=0;i<5;i++) {
			System.out.println(num1[i]);
			
			System.out.println(num1.length);
			// to automatically check the lenght and print the values of length
			for(int t=0;t<num1.length;t++) {
				System.out.println(num1[t]);
			}
			for(int p=0;p<sdnames1.length;p++) {
				System.out.println(sdnames1[p]);
			}
		}
	}

}
