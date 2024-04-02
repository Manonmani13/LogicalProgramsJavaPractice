package logicalprograms;

public class VowelPresent {
public static void main(String[] args) {
	String name="manonmani";
	
//		if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u"))
//		{
//			System.out.println("Vowel are present");
//		}
//		else {
//			System.out.println("Vowels are not Present");
//		}
//	
		System.out.println(name.toLowerCase().matches(".*[aeiou].*"));
}
}
