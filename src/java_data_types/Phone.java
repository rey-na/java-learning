package java_data_types;

public class Phone {
	int imei=34;
	String make;
	String model;
	String color = "White";
	int memory;
	String camera;

	void allinfo() {
		System.out.println("Make: "+make+"\nIMEI: "+imei+"\nModel: "+model+ "\nColor : "+color+"\nMemory : "+memory+ "\nCamera : "+camera);
	}

}
