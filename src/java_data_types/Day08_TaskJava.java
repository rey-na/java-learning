package java_data_types;

import java.util.Scanner;

public class Day08_TaskJava {

	public static void main(String[] args) {
		
		
		String a = "hello";
				String b = "hello";
				if (a=="hello") {
					System.out.println("true");
				}
				
				
		Scanner monthInput = new Scanner(System.in);
		System.out.println("Enter birth month: ");
		String monthName = monthInput.next();
		if(monthName.equals("Jan")) 
			if(monthName.equals("Feb"))
				if(monthName.equals("Mar")) {
			System.out.println("Winter");
		}else if (monthName =="Apr") {
			System.out.println("Fall");
		}else if (monthName == "May") {
			System.out.println("Fall");
		}else {
			System.out.println("Enter valid month");
		}
		
		
		

	}

}
