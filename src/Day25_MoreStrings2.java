
public class Day25_MoreStrings2 {

	public static void main(String[] args) {
	String name="Hello World";
	char[] characters = name.toCharArray(); //{'h','e','l','l','o',etc
	System.out.println(characters.length);
	
	for(int i=0; i<characters.length;i++) {
		System.out.println(characters[i]);
	}
	String sentence = "Hello today we are learning more strings.";
	String [] words = sentence.split(" ");// {'Hello','today', etc
	for(int i=0;i<words.length; i++) {  //loop
		System.out.println(words[i]);
	
	}


	}
	}


