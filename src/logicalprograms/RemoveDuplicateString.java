package logicalprograms;

public class RemoveDuplicateString {
public static void main(String[] args) {
	String name="manonmani",change=name;
	for(int i=0;i<name.length();i++)
	{
		for(int j=i+1;j<name.length();j++)
		{
			if(name.charAt(i)==name.charAt(j))
			{
				change=change.replace(
						String.valueOf(name.charAt(i)), "");
			}
		}
	}
	System.out.println(change);
}
}
