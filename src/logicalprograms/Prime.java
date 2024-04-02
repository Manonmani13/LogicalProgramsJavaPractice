package logicalprograms;

public class Prime {
public static void main(String[] args) {
	int n=12;
	int d=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0) {
			++d;
		}
	}
	if(d==2)
		System.out.println("Prime");
	else
		System.out.println("Not Prime");
}
}
