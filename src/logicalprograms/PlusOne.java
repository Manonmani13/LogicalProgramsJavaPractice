package com.leetcode.prograams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PlusOne {
public static void main(String[] args) {
	int n[]= {9},d=0,no1;
	List<Integer> no=new ArrayList<Integer>();
	

	for(int i=0;i<=n.length-1;i++)
	{
		if(n.length==1)
		{
			if(n[i]+1>9) {
				no1=n[i]+1;
				while(no1!=0)
				{
					d=no1%10;
					no.add(d);
					no1/=10;

				}
			}
			
		}
		else
		{
			if(i==n.length-1)
				no.add(n[i]+1);

			else
				no.add(n[i]);
		}
		
	}
	if(n.length==1)
	{
		Collections.reverse(no);
	}
	
	System.out.println(no);
}

}
