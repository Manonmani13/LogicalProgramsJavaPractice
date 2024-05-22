package com.proretention.scrm.admin;

import java.util.Arrays;

public class SepearatsZerosAndOnces {
    public static void main(String[] args) {
        int a[]={0,1,0,0,1,0,1,0,1,1,1,0};
        int count=0;
        //Method 1
//        Arrays.sort(a);
//
//        for(int i=0;i<=a.length-1;i++)
//        {
//            System.out.println(a[i]);
//        }
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            a[i]=0;
        }
        for(int i=count;i<a.length;i++)
        {
            a[i]=1;
        }
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}
