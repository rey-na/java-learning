package java_data_types;

public class Day22_Encapsulation2 {

	public static void main(String[] args) {
		Day22_Employee_info1 a = new Day22_Employee_info1 ();
		a.setName("Waqas");
		System.out.println(a.getName());
		a.setSsn(1111111);
		System.out.println(a.getSsn());
		
		a.setGraduated(true);
		System.out.println(a.isGraduated());
		
		//Day22_Employee_info1 a = new Day22_Employee_info1("waqas",111111,true);
		//syso (a.getName());
		//syso (a.getSsn());
		//syso(a.isGraduated());

	}

}
