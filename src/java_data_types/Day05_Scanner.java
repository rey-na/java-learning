package java_data_types;

import java.util.Scanner;

public class Day05_Scanner {

	public static void main(String[] args) {
		// create an object/instance of the class
		// classname obhectname =new classname();
		
			Scanner getInput = new Scanner(System.in);
		// getInput in the object of the scanner class.
		//system.in is a part of scanner to take input from client
			System.out.println("Enter the first value : ");
			int aa = getInput.nextInt();
			System.out.println("Enter the second value : ");
			int bb = getInput.nextInt();
			int cc = aa+bb;
			System.out.println("The sum is : "+cc);
		
		

	}

}
