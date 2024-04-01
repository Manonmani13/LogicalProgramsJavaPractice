package logicalprograms;

public class UniqueCount {
public static void main(String[] args) {
	 String name="naveenchandar";
     String repeated="";
     int count=0;
         for(int i=0;i< name.length();i++)
         {
             if(!repeated.contains(String.valueOf(name.charAt(i))))
             {
                 for(int j=0;j<name.length();j++){
                     if(name.charAt(j)==name.charAt(i)){
                         repeated+=name.charAt(j);
                         ++count;
                     }

                 }
             }
             if(count==1)
                 System.out.println(name.charAt(i));
             count=0;
         }   
}
}
