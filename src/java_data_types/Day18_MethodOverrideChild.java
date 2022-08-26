package java_data_types;

public class Day18_MethodOverrideChild extends Day18_MethodOverrideParent  {
	public static void main(String[]arg) {
		Day18_MethodOverrideChild aa = new Day18_MethodOverrideChild();
		aa.openbrowser();
		aa.closebrowser();
		// if close browser was public static 
		//Day18_MethodOverrideParent.closebrowser();
		
	}
	public void openbrowser() {
		System.out.println("Open firefox browser");
		System.out.println("Visit the website");
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Click the login button");
			}
	
	
}

