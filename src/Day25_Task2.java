
public class Day25_Task2 {

	public static void main(String[] args) {
		System.out.println(nospace("Create a method with no space "));
	System.out.println(returnnumbers("90504rgjlkgldfklfgljdf!@#$$%^&&&^%"));
	String a = "Today is a good day. It is Thursday. We hava a class.";
	String[] sen = a.split("\\.");
	System.out.println(sen.length);

	}
	public static String nospace (String sentence) {
		return sentence.replaceAll(" ", "");
	}

	public static int returnnumbers(String words) {
		String specialcharac =words.replaceAll("[A-Za-z0-9]", "");
		int count= specialcharac.length();
		return count;
	}
}
