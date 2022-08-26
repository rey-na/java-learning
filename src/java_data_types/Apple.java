package java_data_types;

public class Apple extends Phone {

	public static void main(String[] args) {
		Apple mob1 = new Apple();
		mob1.imei = 12;
		mob1.make = "Apple";
		mob1.model= "Special Edition";
		mob1.color="Blue";
		mob1.memory = 63;
		mob1.camera = "20";
		
		
		mob1.allinfo();

	}

}
