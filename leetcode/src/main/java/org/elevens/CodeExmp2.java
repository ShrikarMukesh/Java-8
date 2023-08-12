package org.elevens;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
/*
Input (string) Output (string)
aaa             a3
aabbcc          a2b2c2
aaabcdd         a3 b1 c1 d2
a               a1
aa bb aaa       a2b2a3
 */
public class CodeExmp2 {
    public static void main(String[] args) {
        String str = "abcabc";
        //String response = findStringChars(str);
         findConcurrentOcc(str);

    }

    private static void findConcurrentOcc(String str) {
        StringBuilder builder = new StringBuilder();

        ArrayList<String> strings = new ArrayList<>();
        char[] arr = str.toCharArray();
        int counter =0;
        for (int i=0;i < arr.length-1;i++){

            boolean flag = checkSeq(arr[i] , arr[i+1]);
            if (flag){
                builder.append(arr[i]);
                ++counter;
                continue;
            }
            else {
                ++counter;
                builder.append(counter);
                counter = 0;
                strings.add(builder.toString());
                builder.delete(0,builder.length());
            }

            //strings.add(builder);

        }
        System.out.println(strings);
    }

    private static boolean checkSeq(char c1, char c2) {
        if (c1 == c2){
            return true;
        }
        return false;
    }

//    private static String findStringChars(String str) {
//        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
//        for (char c : str.toCharArray()){
//            if (linkedHashMap.containsKey(c)){
//                int flag = linkedHashMap.get(c);
//                linkedHashMap.put(c, ++flag);
//            }
//            else {
//                linkedHashMap.put(c, 1);
//            }
//        }
//        System.out.println(linkedHashMap);
//        return null;
//    }
}
