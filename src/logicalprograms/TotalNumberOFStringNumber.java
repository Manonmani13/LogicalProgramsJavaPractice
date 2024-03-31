package logicalprograms;

public class TotalNumberOFStringNumber {
public static void main(String[] args) {
	String no="235";
	Long tot=0l;
	for(int i=0;i<no.length();i++)
	{
		tot+=Long.parseLong(String.valueOf(no.charAt(i)));
		
	}
	System.out.println(tot);
}
}
