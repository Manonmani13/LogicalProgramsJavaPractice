package logicalprograms;

public class NumberOccurance {
public static void main(String[] args) {
	int n=122322,s=0,count=0;
	String d="";
	while(n!=0)
	{
		s=n%10;
		d=d+s;
		if(d.contains(String.valueOf(s))){
			++count;
		}
		n=n/10;
		if(count>1)
		System.out.println(s+ " "+count);

	}
}
}
