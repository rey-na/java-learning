
public class Day25_MoreStrings {

	public static void main(String[] args) {
	String words = "!@u1#y$2t%%3r^t4^y5&j&6j10SGGJGJDJDJ&7h*7g*f8*(9dsa9(";
	String nonumbers = words.replaceAll("[0-9]", "");//"" eliminates //"no" will replace nums for no
	System.out.println("Before removing [0-9]numbers"+words);
	System.out.println("After removing[0-9] numbers" + nonumbers);
	String noletra = words.replaceAll("[A-Z]", "");
	System.out.println(noletra);
	
	String nominuscula = words.replaceAll("[a-z]", "!");
	System.out.println(nominuscula);
	
	String special = words.replaceAll("[A-Za-z0-9]", "");
	System.out.println(special);

	String onlynum = words.replaceAll("[^0-9]","");// ^ will show  the numbers instead of subtract with replaceall
	System.out.println(onlynum);
	
	String nonum = words.replaceAll("[^a-z]","");
	System.out.println(nonum);
	
	String nospecialcharacters =words.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(nospecialcharacters);
	}

}
