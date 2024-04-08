package logicalprograms;

public class PeakSmallerNeighbours {
public static void main(String[] args) {
	int n[]= {200,100,130};
	System.out.println(n.length/2);
	int first=0,last=0;
	for(int i=0;i<n.length;i++)
	{
	
	for(int j=i+1;j<n.length;j++)
	{
	if(j<=n.length/2) {
		if(n[i]<n[j])
		{
			first=n[j];
			
		}	
		if(n[i]>n[j])
		{
			first=n[i];
		}	
	}
	 if(n.length/2<j) {
		if(n[i]<n[j])
		{
			last=n[j];
			
		}	
		if(n[i]>n[j])
		{
			last=n[i];
		}	
	}
	
	}
	}
	System.out.println(first+" "+last);

}
}

