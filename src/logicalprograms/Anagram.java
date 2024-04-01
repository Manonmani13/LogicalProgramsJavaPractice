package logicalprograms;

public class Anagram {
public static void main(String[] args) {
	String sample="chandar";
    String name="handcar";
    boolean anagram=false;
    if(sample.length()==name.length()){
        for(int i=0;i< sample.length();i++)
        {
            for(int j=0;j<name.length();j++){
                if(name.charAt(j)==sample.charAt(i)){
                   anagram=true;
                   break;
                }

            }
        }
    }
    else
    {
        anagram=false;
    }
    System.out.println(!anagram?"Not Angram":"Anagram");     
    
}
}
