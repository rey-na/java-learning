
public class Day25_Tasks {

	public static void main(String[] args) {
	 task1("San Juan Puerto Rico");
	 task2("Carisimo!!!!! Me costo mucho $$$$$$$$!!!!");

	}
	
	public static void task1(String city) {
		String a = city.replaceAll("[' ']", "");
		System.out.println(a);
		
		}
	public static void task2(String city) {
		String a = city.replaceAll("[a-zA-Z0-9' ']","");
		int b= a.length();
		System.out.println(b);
	}
	
	
		
			


	
	
}
		
		


