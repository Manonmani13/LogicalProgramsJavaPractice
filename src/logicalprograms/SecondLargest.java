package logicalprograms;

import java.util.Arrays;

public class SecondLargest {
public static void main(String[] args) {
	int n[]= {15,20,12,8,10,9,2,3,5,6,7};
	Arrays.sort(n);
	int max=n.length-1;
	for(int i=0;i<n.length;i++) {
		if(max<n[i])
		{
			max=i;
		}

	}
	System.out.println(n[max-1]);
}
}
