package com.proretention.scrm.admin;

public class LengthFinder {
    public static void main(String[] args) {
        String name="leena";
        char letter[]=name.toCharArray();
        int count=0;
        for(char l:letter)
        {
            count++;
        }
        System.out.println(count);
    }
}
