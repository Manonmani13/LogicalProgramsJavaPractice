package logicalprogram.arrays;

public class SumOfTwo {
public static void main(String[] args) {
	int nums[]= {2,3,4,5,6};
	int index[]=new int[2];
	int target=6;
    for(int i=0;i<nums.length;i++)
    {
        for(int j=i+1;j<nums.length;j++)
        {
        	if(target==(nums[i]+nums[j]))
        	{
        		index[i]=i;
        		index[i+1]=j;
        	}
        }
    }
    for(int i=0;i<index.length;i++)
    {
    	System.out.println(index[i]);
    }
}
}
