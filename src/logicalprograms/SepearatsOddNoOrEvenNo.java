package com.proretention.scrm.admin;

public class SepearatsOddNoOrEvenNo {
    public static void main(String[] args) {
        int a[]={12,15,20,40,30,15,55};
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }

        }
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }

        }


//        for(int i=0;i<=a.length-1;i++){
//            System.out.println(a[i]);
//        }
    }
}
