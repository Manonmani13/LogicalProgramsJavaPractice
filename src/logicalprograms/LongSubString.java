package com.leetcode.prograams;

public class LongSubString {
public static void main(String[] args) {
	String s = "au";
    String longestSubstring = "";
    int max=0;
    
    for (int i = 0; i < s.length(); i++) {
        String currentSubstring = "";
        for (int j = i; j < s.length(); j++) {
            if (currentSubstring.contains(String.valueOf(s.charAt(j)))) {
                break;
            }
            currentSubstring += s.charAt(j);
        }
        if (currentSubstring.length() > longestSubstring.length() || longestSubstring.isEmpty()) {
            longestSubstring = currentSubstring;
            max=currentSubstring.length();
        }
    }
		
		System.out.println( longestSubstring);
}

}
