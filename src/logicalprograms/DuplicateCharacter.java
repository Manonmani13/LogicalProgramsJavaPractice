package logicalprograms;

public class DuplicateCharacter {
public static void main(String[] args) {
	String s1="naveen";
    String repeated="";
        for(int i=0;i< s1.length();i++)
        {
            if(!repeated.contains(String.valueOf(s1.charAt(i)))) {
                for (int j = i + 1; j < s1.length(); j++) {
                    if (s1.charAt(i) == s1.charAt(j)) {
                        repeated += s1.charAt(i);
                        break;
                    }
                }
            }
        }
    System.out.println(repeated);
}
}
