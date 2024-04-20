package com.leetcode.prograams;

public class LongestPalindrome {
	 public static String longestPalindrome(String s) {
	        if (s == null || s.length() < 1) return "";

	        String longest = "";
	        for (int i = 0; i < s.length(); i++) {
	            String oddPalindrome = expandAroundCenter(s, i, i);
	            String evenPalindrome = expandAroundCenter(s, i, i + 1);
	            String currentLongest = oddPalindrome.length() > evenPalindrome.length() ? oddPalindrome : evenPalindrome;
	            if (currentLongest.length() > longest.length()) {
	                longest = currentLongest;
	            }
	        }
	        return longest;
	    }

	    private static String expandAroundCenter(String s, int left, int right) {
	        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        return s.substring(left + 1, right);
	    }

	    public static void main(String[] args) {
	        String s1 = "babad";
	        String s2 = "cbbd";

	        System.out.println("Longest palindrome in '" + s1 + "': " + longestPalindrome(s1));
	        System.out.println("Longest palindrome in '" + s2 + "': " + longestPalindrome(s2));
	    }
}
