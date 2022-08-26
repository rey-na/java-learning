package java_data_types;

public class Day04_Nestedlf {

	public static void main(String[] args) {
// VP 200000,IT_PROG 120000, ANALYST 80000 IF SR 50000MORE IF JR BASE SALARY
		String title = "VP";
		String role = "junior";

		if (title == "VP") {
			System.out.println("Vice President");
			if (role == "junior") {
				System.out.println("Salary is $200000");
			} else if (role == "senior") {
				System.out.println("Salary is $250000");
			} else {
				System.out.println("The role does not exist");
			}
		} else if (title == "IT_PROG") {
			System.out.println("IT Programmer");

			if (role == "junior") {
				System.out.println("Salary is $120000");
			} else if (role == "senior") {
				System.out.println("The salary is $170000");
			} else {
				System.out.println("The role does not exist");
			}
		} else if (title == "ANALYST") {
			System.out.println("System Analyst");
			if (role == "junior") {
				System.out.println("The salary is $80,000");
			} else if (role == "senior") {
				System.out.println("The salary is $130,000");
			} else {
				System.out.println("The role does not exist");
			}
		} else {
			System.out.println("The role does not exist");
		}
		
	}
}
