package java_data_types;

public class Day22_Employee_info1 {
	private String name;
	private int ssn;
	private boolean graduated;
	// this method will only access within class
	// Day22_Employee_info1(String name,int ssn,boolean graduated){
	// this.name=name;
// this.ssn = ssn;
	//this.graduated=graduated;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public boolean isGraduated() {
		return graduated;
	}
	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}
	
	

}
