package com.proretention.scrm.calendar;

public class StringVowels {
    public static void main(String[] args) {
      String name="manonmani";
      for(int i=0;i<name.length();i++)
      {
          if(name.charAt(i)=='a'||name.charAt(i)=='e'||
                  name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'
          ||name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||
                  name.charAt(i)=='U')
          {
              System.out.println(name.charAt(i));
          }
      }
    }

}
