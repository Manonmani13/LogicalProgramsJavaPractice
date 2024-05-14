package com.proretention.scrm.admin;

import java.util.HashSet;
import java.util.Set;

public class rotationOfString {

    public static void main(String[] args) {
        System.out.println("Rotation String "+rotationOfStrings("manonmani", "manimanon"));
    }

    private static Boolean rotationOfStrings(String text,String text2) {
        String str=text+text;
        System.out.println(str+" "+ str.contains(text2));
        if(str.contains(text2)){
            System.out.println(text+text2);
            return true;
        }
        return false;

    }


}
