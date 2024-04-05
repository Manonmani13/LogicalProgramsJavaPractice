package logicalprograms;

public class LargestNo {
public static void main(String[] args) {
	int n[]= {2,3,5,15,8,10};
	int  max=n[0];
	for(int i=1;i<n.length;i++)
	{
		if(max<n[i]) {
			max=n[i];
		}
	}
	System.out.println(max);
}
}
