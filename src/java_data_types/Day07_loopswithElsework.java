package java_data_types;

import java.util.Scanner;

public class Day07_loopswithElsework {

	public static void main(String[] args) {
		for(int t = 0; t<=3;t++) {
	Scanner i = new Scanner(System.in);
	System.out.println("Enter numerical month (1 to 12):");
	
	int p = i.nextInt();
	if (p <=03) {
		System.out.println("winter");
	}else if (p <=06 ) {
			System.out.println("spring");
			
		}else if (p<=9) {
			System.out.println("summer");
		}else if (p<=12) {
			System.out.println("fall");
		}else {
			System.out.println("invalid");
		}
		}
	}
	

	}


