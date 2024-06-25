package com.proretention.scrm.calendar;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateUsingStream {
    public static void main(String[] args) {
        int arr[]={2,3,4,4,5,5,6,6};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }

            }
        }

        List<Integer> ls= Arrays.asList(1,2,4,4,2,3);

        ls.stream().distinct().forEach(System.out::println);
    }
}
