package logicalprograms;

public class Rotational {
public static void main(String[] args) {
	String s1="manonmani" ,s2="manimanon";
    String repeated="";
    if(s1.length()==s2.length()){
        for(int i=0;i< s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j)){
                    repeated+=s2.charAt(i);
                    break;
                }
            }
        }
    }
    if(s1.length()==repeated.length()){
        System.out.println("rotational string");
    }
    else{
        System.out.println("not rotational string");
    }
}
}
