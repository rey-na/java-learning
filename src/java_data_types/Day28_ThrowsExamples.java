package java_data_types;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Day28_ThrowsExamples {

	public static void main(String[] args) {
		try {
			validateAge(20);
			validateAge(18);
			writeInFile();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void validateAge (int age)throws Exception{
		if (age<18) {
			throw new Exception("Age is less than 18");
		
		}else if (age>=18) {
			System.out.println("Allowed");
		}
	}
public static void writeInFile()throws FileNotFoundException{
	String file = "C:\\Users\\codegator\\file1.txt";
	FileInputStream fis = new FileInputStream(file);
}
}
