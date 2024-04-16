package logicalprogram.arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a[]= {5,10,20,30,100,50,60,0,80,1};
		int no=87387283,reverse=0,d;
		while(no!=0)
		{
			d=no%10;
			reverse=reverse*10+d;
			no/=10;
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);

		}
		System.out.println(reverse);
	}
}
