package java_data_types;

public class Day24_Task {
	//Task 1. Create a method that will take 1 parameter as a String. If the String has odd number of characters and has 3 or more characters, print the character in the middle of the String.
	//Task 2. Create a method that will take 1 parameter as a String. If the String has even number of characters and has 5 or more characters, print the middle two characters of the String.
	//Task 3. Create a method that will take 2 parameters as a String(actualValue, expectedValue). Your method should return boolean value verifying whether given two strings are equal or not

	public static void main(String[] args) {
		taskOne("Hello");
		taskOne("USA");
		taskTwo("abcdefgh");
	System.out.println(taskThree("Gas", "Station"));	
	System.out.println(taskThree("Twins", "Twins"));
	
	

}
	public static void taskOne(String word) {
		int worldlength = word.length();
		if (worldlength >=3) {
			if (worldlength % 2 == 1) {
				int center = worldlength /2;
				System.out.println(word.substring(center, center + 1));
			}
		}
	}
	public static void taskTwo(String word) {
		int worldlength = word.length();
		if (worldlength >=5) {
			if (worldlength % 2 == 0) {
				int center = worldlength /2;
				System.out.println(word.substring(center -1, center + 1));
			}
		}
	}	
	public static boolean taskThree (String valueOne, String valueTwo) {
		return valueOne.equals(valueTwo);
	}
	}

	
