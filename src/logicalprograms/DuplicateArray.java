package logicalprograms;

public class DuplicateArray {
public static void main(String[] args) {
	int s[]= {2,3,4,3,5,2};
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length;j++)
		{
			if(s[i]==s[j]) {
				System.out.print(s[j]+" ");
			}
		}
	}
}
}
