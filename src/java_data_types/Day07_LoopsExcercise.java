package java_data_types;

import java.util.Scanner;

public class Day07_LoopsExcercise {

	public static void main(String[] args) {
		/*for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			
		}
		for(int i=100; i>= 0;i--) {
			System.out.println(i);
		}
		for(int i=20;i<= 50;i++)
			if( i%2==0)
		{
			System.out.println(i);
		}
		for(int i=20;i<=50;i++)
			if (i%2==1) {
				System.out.println(i);
			}*/
		for(int i=1;i<=3;i++) {
		Scanner month = new Scanner(System.in);
		System.out.println("Enter birth month:");
		String value1 = month.next();
				switch (value1) {
				case "january":
				case "february":
				case "march":
					System.out.println("winter");
					break;
				case"april":
				case "may":
				case"june":
					System.out.println("spring");
					break;
				case"july":
				case"august":
				case"september":
					System.out.println("summer");
					break;
				case"october":
				case"november":
				case"december":
					System.out.println("fall");
					break;
					default:
						System.out.println("try again");
				}
		
				
				
			
				}
				

	}

}
