package logicalprograms;

public class EqulityTwoArrau {
	public static void main(String[] args) {
		int n[]= {2,4,3,5,6,4,2,9};
		int n2[]= {2,4,3,5,6,8,2};
		boolean show=false;
		if(n.length==n2.length)
		{
			for(int i=0;i<n.length;i++)
			{
				for(int j=0;j<n2.length;j++)
				{
					if(n[i]==n[j])
					{
						show=true;
					}
					else {
						show=false;
						break;
					}
				}
			}
		}
			System.out.println(show?"Equals":"Not Equal");
		
		
	}
}
