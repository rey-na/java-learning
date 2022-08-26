package java_data_types;
class Phone2 {
	Phone2(){
		System.out.println("This is phone constructor");
	}
	Phone2(String name){
		System.out.println("This is a parameterized constructor "+name);
		
		}
	}

class smartphone1 extends Phone2 {
	smartphone1(){
		super("John");
		System.out.println("This is a smart phone constructor");
	}
}

public class Day19_SuperMethod {

	public static void main(String[] args) {
		smartphone1 a = new smartphone1();
		

	}

}
