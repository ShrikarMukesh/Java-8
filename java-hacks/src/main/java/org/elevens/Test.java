package org.elevens;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String input = "pwwkew";
        //String input = "abcabcbb";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest substring: " + longestSubstring);
    }
    public static String findLongestSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        int n = input.length();
        int start = 0, end = 0;
        Set<Character> uniqueChars = new HashSet<>();
        String longestSubstring = "";
        while (start < n && end < n) {
            if (!uniqueChars.contains(input.charAt(end))) {
                uniqueChars.add(input.charAt(end));
                end++;
                if (end - start > longestSubstring.length()) {
                    longestSubstring = input.substring(start, end);
                }
            } else {
                uniqueChars.remove(input.charAt(start));
                start++;
            }
        }
        return longestSubstring;
    }
}
