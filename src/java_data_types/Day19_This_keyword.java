package java_data_types;

public class Day19_This_keyword {
	int rollNum;
	String name;
	float fee;

	Day19_This_keyword() {
		System.out.println("Hello this is a default constructor");
	}

	Day19_This_keyword(int nollNum) {
		this();
		System.out.println("This is a 1 parameter costructor" + rollNum);
	}

	Day19_This_keyword(int rollNum, String name, float fee) {
		// can be used to invoke the current class constructor.
		this(3333333);
		this.rollNum = rollNum;
		this.name = name;
		this.fee = fee;
	}

	void displayData() {
		System.out.println("Roll Num: " + rollNum);
		System.out.println("Name: " + name);
		System.out.println("Fee: " + fee);
	}
}
