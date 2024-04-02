package logicalprograms;

public class Palindrome {
public static void main(String[] args) {
	String text="nani",cont="";
	for(int i=text.length()-1;i>=0;i--)
	{
		cont+=text.charAt(i);
	}
	if(text.equalsIgnoreCase(cont))
		System.out.println("Panlindrome");
	else
		System.out.println("Not Palindrome");
}
}
