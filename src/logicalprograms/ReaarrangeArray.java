package logicalprogram.arrays;

public class ReaarrangeArray {
public static void main(String[] args) {
	int n[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
	for(int i=0;i<n.length-1;i++)
	{
		if(n[i]<0)
		{
			System.out.println(n[i]);
		}
	}
	for(int i=0;i<n.length-1;i++)
	{
		if(n[i]>0)
		{
			System.out.println(n[i]);
		}
		
	}
}
}
