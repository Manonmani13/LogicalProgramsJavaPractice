package logicalprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		int s[]= {2,3,4,3,5,2};
		Set<Integer> l=new LinkedHashSet<Integer>();
		for(int n:s)
		l.add(n);
		System.out.println(l);
	}
}
