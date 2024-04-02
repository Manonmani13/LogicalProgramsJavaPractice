package logicalprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOddNo {
public static void main(String[] args) {
	List<Integer> no=Arrays.asList(10,9,3,2,15,2,3);
	for(Integer n:no)
	{
		if(n%2!=0)
			System.out.println(n);
	}
}
}
