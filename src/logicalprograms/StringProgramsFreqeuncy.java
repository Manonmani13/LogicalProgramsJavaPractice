package logicalprograms;

public class StringProgramsFreqeuncy {
public static void main(String[] args) {
	String name="naveenchandar";
	
	int count=1;
	String op="";
	for(int i=0;i<name.length();i++)
	{
		if(!op.contains(String.valueOf(name.charAt(i)))) {
		op+=name.charAt(i);
	
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j) )
				{
					++count;

				}
			}
			
			System.out.println(" op "+name.charAt(i)+ count);
count=1;
//System.out.println(op.contains("m"));
		}
	}
	
		
		
		
	
}
}
