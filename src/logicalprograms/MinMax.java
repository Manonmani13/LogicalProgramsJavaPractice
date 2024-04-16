package logicalprogram.arrays;

public class MinMax {
public static void main(String[] args) {
	int a[]= {5,10,20,30,100,50,60,0,80,1};
	int min=a[0],max=a[0],average=0;
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
		if(min>a[i])
		{
			min=a[i];
		}

		
	}
	average=a.length/2;
	System.out.println(max+" "+min+" "+a[average]);
}
}
