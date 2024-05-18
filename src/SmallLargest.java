package com.proretention.scrm.admin;

public class SmallLargest {
    public static void main(String[] args) {
        int nums[]={2,10,30,80,4,0,50};
        int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i])
                min=nums[i];
            if(max<nums[i])
                max=nums[i];

        }
        System.out.println("min "+min+" max "+max);

    }
}
