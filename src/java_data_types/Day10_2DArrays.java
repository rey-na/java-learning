package java_data_types;

public class Day10_2DArrays {

	public static void main(String[] args) {
		String [][] countries = new String[2][2];
		countries[0][0]="USA";
		countries[0][1]="Canada";
		countries[1][0]="Switzerland";
		countries[1][1]="France";
		System.out.println(countries[1][1]);
		System.out.println(countries[0][1]);
		
		//String[] countries1={"canada","usa","switzerland","france"};
		String[][] _countries={
		{"usa","canada"},
		{"france","switzerland",},
		{"germany","england"}
		};
		//System.out.println(_countries[1][1]);
		System.out.println(_countries.length);//length is the row lengths
		System.out.println(_countries[0].length);//the[0]represent row number0 
		for(int rows=0;rows<_countries.length;rows++){
			System.out.println(_countries[rows][0]);
		}
		//int[][] values= new int[2][3];
		//values[0][0]=10;
	//values[0][1]=20;
		//values[0][2]=30;
		//values[1][0]=1;
		//values[1][1]=2;
		//values[1][2]=3;
		//System.out.println(values[0][2]);
		//System.out.println(values[1][2]);
		
		for(int rows=0;rows<_countries.length;rows++) {
		for(int column = 0; column<_countries[rows].length;column++) {
			System.out.println(_countries[rows][column]);
		}
		}

				
				

	}

}
