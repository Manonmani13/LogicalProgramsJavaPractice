package com.proretention.scrm.calendar;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int no1=12,no2=22;
        no2=no1+no2;
        no1=no2-no1;
        no2=no2-no1;
        System.out.println(no1 +" "+no2);
    }

}
