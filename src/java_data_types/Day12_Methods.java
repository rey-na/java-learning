package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
		//argument
		//name();
		//name2("We");
		//name2("You");
		//name3("Ken",35);
		//name3("Lily",30);
		String a = day(); // in return it will give a String value
		System.out.println(a);
		
		System.out.println(day());
		
		String b = month();
		System.out.println(b);
		
		int c = time();
		System.out.println("What time is it? It is "+c);
		
		String value = topic(" void an non void methods");
		System.out.println(value);
		
		System.out.println(topic(" parameterized and non parameterized methods"));
	} 
	
	// none void method with parameters 
	public static String topic (String a ) {
		return "Today we are learning"+ a;
	}
	//non void method without parameters
	public static String day() {
		String todaysDay = "Tuesday";
		return todaysDay;
	}
	public static int time() {
		int time = 730;
		return time;
	}
	
	public static String month() {
		return "August";
	}
	// non void method with parameters

		
	
	
	
	
	//method without parameter
public static void name() {
	System.out.println("My name is Waqas Khan");
}
//method with parameter
public static void name2(String a ) {
	System.out.println("My name is "+a);
}
public static void name3(String name, int age) {
	System.out.println(name + " is "+age+" years old.");
}

}
