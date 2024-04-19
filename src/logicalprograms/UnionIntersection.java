package logicalprogram.arrays;

public class UnionIntersection {
public static void main(String[] args) {
	int a1[]={1, 3, 4, 5, 7};
	int a2[]={2, 3, 5, 6} ;
	int length=a1.length+a2.length;
	int un[]=new int[length];
	for(int i=0;i<a1.length;i++)
	{
		un[i]=a1[i];
	}
	for(int i=0;i<a2.length;i++)
	{
		un[a1.length+i]=a2[i];
	}
	for(int i=0;i<un.length;i++)
	{
		System.out.println(un[i]);
	}
	for(int i=0;i<a1.length;i++)
	{
		for(int j=0;j<a2.length;j++)
		{
			if(a1[i]==a2[j])
				System.out.println("inter "+un[i]);

		}
	}
}
}
