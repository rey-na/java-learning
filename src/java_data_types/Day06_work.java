package java_data_types;

import java.util.Scanner;

public class Day06_work {

	public static void main(String[] args) {
		Scanner takeInput = new Scanner(System.in);
		System.out.println("Calculations");
		System.out.println("Enter first value: ");
		int number1 = takeInput.nextInt();
		System.out.println("Enter second value: ");
		int number2 = takeInput.nextInt();
		System.out.println("Select calculation type ( + - / * ): ");
		char aa = takeInput.next().charAt(0);
		if(aa =='+') {
			System.out.println(number1+number2);
		}else if(aa== '-'){
			System.out.println(number1-number2);
		}else if (aa=='/') {
			System.out.println(number1/number2);
		}else if (aa=='*') {
			System.out.println(number1*number2);
		}else {System.out.println("not working properly");}
		
		System.out.println("put in value:");
		int num1= takeInput.nextInt();
		System.out.println("put in second value:");
		int num2 = takeInput.nextInt();
		System.out.println("enter calculation type (+-*/):");
		char bb = takeInput.next().charAt(0);
		switch (bb) {
		case '+' :
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case'*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			default:
				System.out.println("wrong calculation");
				
		
		}
		

	}

}
