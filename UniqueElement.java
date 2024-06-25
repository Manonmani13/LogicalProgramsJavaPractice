package com.proretention.scrm.calendar;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,4,5,5,6,6};

        for(int i=0;i<arr.length;i++)
        {
            int j;
            for( j=0;j<i;j++)
            {
                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
                    break;
                }



            }
            if (i == j)
                System.out.print( arr[i] + " ");
        }

    }
}
