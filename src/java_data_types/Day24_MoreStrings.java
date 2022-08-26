package java_data_types;

public class Day24_MoreStrings {

	public static void main(String[] args) {
		String fname = "Waqas";
		String lname = "Khan";
		String fullname = fname.concat(lname);
		System.out.println(fullname);

		String day = "    Today we are learning Stringss   ";// double ss false on this value
		System.out.println("Before using trim: " + day);
		day = day.trim();
		System.out.println("After using trim: " + day);
		if (day.equals("Today we are learning Strings")) {
			System.out.println("Yayy, the string value matched.");
		} else {
			System.out.println("The value does not match");
		}
		String transaction = "$50";
		boolean dollarsign = transaction.startsWith("$");
		if (dollarsign) {
			System.out.println("The sign is present");
		} else {
			System.out.println("The sign is not present");
		}
		System.out.println(day.startsWith("Today"));

		boolean stringpresent = day.endsWith("Strings");// false on this value no double ss
		System.out.println(stringpresent);

		char ret = transaction.charAt(0);
		char ret1 = transaction.charAt(1);
		System.out.println(ret);
		System.out.println(ret1);

		System.out.println(transaction.indexOf('5'));

		String email = "Hello123@gmail.com"; // index starts from 0
		System.out.println(email.indexOf('@')); // so index is 8

		System.out.println(email.substring(8));// beggining index, breaks down a string

		System.out.println(email.substring(0, 8));

		String title = "Welcome to the Car dealer$hip";
		System.out.println(title);
		title = title.replace("$", "s");
		System.out.println(title);

	}

}
