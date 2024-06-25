package com.proretention.scrm.calendar;

public class FindMinMaxAvg {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,3,2};
        int a=arr[0],min=arr[0],sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(a<arr[i]){
                a=arr[i];
            }
            else if(min>arr[i])
            {
                min=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println("average "+sum/arr.length);
        System.out.println(a+" "+min);
    }
}
