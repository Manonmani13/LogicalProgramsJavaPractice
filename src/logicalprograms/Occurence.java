package logicalprogram.arrays;

public class Occurence {
public static void main(String[] args) {
	int n[]= {3,2,3,2,4,2,3,1,4,0};
	int n0=2,count=0;
	for(int i=0;i<n.length;i++)
	{
		if(n[i]==n0)
		{
			count++;
		}
	}
	System.out.println(n0+" "+count);
}
}
