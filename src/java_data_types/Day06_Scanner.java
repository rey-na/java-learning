package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		// how to create an object
		// classname objectname = new classname();

		Scanner takeInput = new Scanner(System.in);
		System.out.println("Enter the int value : ");
		int val1 = takeInput.nextInt();
		System.out.println("The entered value is: " + val1);

		// nextBoolean (true,false)
		System.out.println("Is it raining outside : ");
		boolean val2 = takeInput.nextBoolean();
		System.out.println("If it is true it is raining, if its false then its not raining : " + val2);
		
		// nextline (String)
		System.out.println("Enter your name : ");
		String name = takeInput.next();
		System.out.println("The name you entered is: "+name);
		
		//nextbyte 
		System.out.println("Enter your age : ");
		byte age = takeInput.nextByte();
		System.out.println("Age is: "+age);
		
		//
		System.out.println("Calculations");
		System.out.println("Enter first value: ");
		int number1 = takeInput.nextInt();
		System.out.println("Enter second value: ");
		int number2 = takeInput.nextInt();
		System.out.println("Select calculation type ( + - / * ): ");
		String aa = takeInput.next();
		if(aa =="+") {
			System.out.println(number1+number2);
		}else if(aa== "-"){
			System.out.println(number1-number2);
		}else if (aa=="/") {
			System.out.println(number1/number2);
		}else if (aa=="*") {
			System.out.println(number1*number2);
		}else {System.out.println("not working properly");}
		
				
		

	}

}
