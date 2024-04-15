package logicalprograms;

public class longestSubstrin {
public static void main(String[] args) {
	String a="abcabcbb",ch="";
	int count=1;
	for(int i=0;i<a.length();i++)
	{
		if(!ch.contains(String.valueOf(a.charAt(i))))
		{
			ch=ch+a.charAt(i);

			for(int j=i+1;j<a.length();j++)
			{
				
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				
			}
			System.out.println(ch+" "+count);

			count=1;

		}
		

	}

}
}
