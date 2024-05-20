package com.proretention.scrm.admin;

public class OddNumberOccurence {
    public static void main(String[] args) {
        int nums[]={20,10,20,30,15,30,70};
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count%2==1)
                System.out.println(nums[i]);
            count=0;

        }

    }
}
