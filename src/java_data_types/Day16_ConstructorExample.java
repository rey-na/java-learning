package java_data_types;

public class Day16_ConstructorExample {

	public static void main(String[] args) {
		//instantiating
		//created a new instance object
		//created the object of the class
		Day16_Constructor cons = new Day16_Constructor();

		Day16_Constructor para_con = new Day16_Constructor("Administrator");

		Day16_Constructor para_con2 = new Day16_Constructor("Editor");
		Day16_Constructor twopara_cons = new Day16_Constructor("admin", "qa.codegator.us");
		Day16_Constructor int_cons = new Day16_Constructor(1000);
		
		//calling the method
		cons.hello();
		para_con.hello();
		
		// class reference when the method is declared static
		//Day16_Constructor.hello();
	}

}
