package com.proretention.scrm.admin;

public class Permutation {
    public static void main(String[] args) {
        String name="leena",text="naeel",value="";
        if(name.length()==text.length())
        {
           for(int i=0;i<name.length();i++)
           {

               for(int j=0;j<text.length();j++)
               {

                   if(name.charAt(i)==text.charAt(j))
                   {
                       value+=text.charAt(j);
                       break;
                   }
               }
           }

        }
        if(name.equals(value))
        {
            System.out.println("Permutation");
        }
        else {
            System.out.println("Not permutation");

        }
    }
}
