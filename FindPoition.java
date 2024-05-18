package com.proretention.scrm.admin;

public class FindPoition {
    public static void main(String[] args) {
        int nums[]={2,10,30,80,4,0,50};
        int target=80;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                System.out.println(i+1);
            }

        }

    }
}
