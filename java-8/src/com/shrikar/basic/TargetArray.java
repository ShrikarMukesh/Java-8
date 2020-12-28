package com.shrikar.basic;
import java.util.*;
public class TargetArray {
    public static void main(String[] args) {
        String[] s = new String[]{"xyz", "bad", "aeiou", "hello"};

        Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o2.replaceAll("[^aeiouAEIOU]", "").length()
                        - o1.replaceAll("[^aeiouAEIOU]", "").length();
            }
        });
        String input = "shrikar";
       int g=  input.replaceAll("r","").length();
        System.out.println(g);

    }
}
