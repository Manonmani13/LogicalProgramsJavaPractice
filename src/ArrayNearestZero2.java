package com.proretention.scrm.admin;

import java.util.Arrays;

public class ArrayNearestZero {
    public static void main(String[] args) {
        int a[]={1,2,3,4,0,-5,-3,10,-6};
        int target=4;
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                int sum=a[i]+a[j];
                if(sum>0&& sum<target||sum==target)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
