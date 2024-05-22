package com.proretention.scrm.admin;

import java.util.Arrays;

public class ArrayNearestZero {
    public static void main(String[] args) {
        int a[]={1,2,3,4,0,-5,-3};
        int target=4;
        for(int i=0;i<=a.length-1;i++)
        {
            if((i+1)<a.length-1){
                int sum=a[i]+a[i+1];
                if(sum>0&& sum<target||sum==target)
                {
                    System.out.println(a[i]+" "+a[i+1]);
                }
            }


        }
    }
}
