package logicalprograms;

public class DuplicateArrayRemover {
public static void main(String[] args) {
	int s[]= {2,3,4,3,5,2};
	String s2="";
	for(int i=0;i<s.length-1;i++)
	{
		if(!s2.contains(String.valueOf(s[i])))
			if(s[i]!=s[i+1]) {
				s2+=s[i];
			}
		
	}
	System.out.println(s2);
}
}
