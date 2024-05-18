package com.proretention.scrm.admin;

public class MissingInteger {
    public static void main(String[] args) {
        int nums[]={0,1,2,3,4,5,6,7,8,9};
        int n[]={0,2,3};
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            if(n[n.length-1]==nums[i])
            {
                len=i;
            }
        }
        System.out.println(len);
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<n.length;j++)
            {
                if(nums[i]==n[j]){
                    break;
                }
                else{
                    if(j==n.length-1) {
                        System.out.println("missing no " + nums[i]);
                        break;
                    }
                }
            }
        }
    }
}
