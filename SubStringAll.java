package com.proretention.scrm.admin;

public class SubStringAll {
    public static void main(String[] args) {
        String name="manonmani";
        for(int i=0;i<name.length();i++)
        {
            for(int j=i+1;j<name.length();j++)
            {
                System.out.println(name.substring(i,j));
            }
        }
    }
}
