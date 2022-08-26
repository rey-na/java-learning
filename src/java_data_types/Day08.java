package java_data_types;

import java.util.Scanner;

public class Day08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner monthInput = new Scanner(System.in);
		for (int a = 0; a < 3; a++) {
			System.out.println("Enter birth month: ");
			String monthName = monthInput.next();
			if (monthName.equalsIgnoreCase("Jan") || monthName.equalsIgnoreCase("Feb") || monthName.equalsIgnoreCase("Mar")) {
				System.out.println("Winter");
			} else if (monthName.equalsIgnoreCase("Apr") || monthName.equalsIgnoreCase("May") || monthName.equalsIgnoreCase("Jun")) {
				System.out.println("Spring");
			} else if (monthName.equalsIgnoreCase("Jul") || monthName.equalsIgnoreCase("Aug") || monthName.equalsIgnoreCase("Sep")) {
				System.out.println("Summer");
			} else if (monthName.equalsIgnoreCase("Oct") || monthName.equalsIgnoreCase("Nov") || monthName.equalsIgnoreCase("Dec")) {
				System.out.println("Fall");
			} else {
				System.out.println("Provide the valid month");
			}
		}

	}

}
