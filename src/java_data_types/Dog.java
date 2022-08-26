package java_data_types;

public class Dog {
	String breed;
	String size;
	String color;
	int age;
	
	public static void main(String[] args) {
		Dog dog1= new Dog();
		dog1.breed = "German Shepherd";
		dog1.size = "Large";
		dog1.color = "Black/brown";
		dog1.age = 3;
		
		Dog dog2 = new Dog();
		dog2.breed = "Chow chow";
		dog2.size = "Small";
		dog2.color = "Brown";
		dog2.age = 2;
		
		System.out.println(dog1.breed+","+dog1.size);
		System.out.println(dog1.size);
		System.out.println(dog1.color);
		System.out.println(dog1.age);
		System.out.println(dog2.breed);
		System.out.println(dog2.size);
		System.out.println(dog2.color);
		System.out.println(dog2.age);

		
		
	

	}

}
