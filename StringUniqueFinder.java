package com.proretention.scrm.admin;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueFinder {

    public static void main(String[] args) {
        System.out.println("Unique or not "+unique("mano"));
    }

    private static Boolean unique(String text) {
        Set s=new HashSet();
        for(int i=0;i<text.length();i++)
        {
            char c=text.charAt(i);
            if(!s.add(c))
                return false;
        }
        return true;

    }
}
