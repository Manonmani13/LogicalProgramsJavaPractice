package logicalprogram.arrays;

public class SortArray {
public static void main(String[] args) {
	int n[]= {2,4,8,3,7,1,9};
	String n1="";
	for(int i=0;i<n.length;i++)
	{
		for(int j=0;j<n.length;j++)
		{
			if(!n1.contains(String.valueOf(n[j])))
			{
				
				if(n[j]<=n[i])
				{
					n1=n1+n[j];
				}
			}
			
		}
	}
	System.out.println(n1);
}
}
