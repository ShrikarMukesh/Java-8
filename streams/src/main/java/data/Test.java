package data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String str = "shrikarmukesh";
        char[] cArr = new char[25];
        char[] array = str.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int flag=1;
        for(int i=0;i<array.length;i++){
            if(hashMap.containsKey(array[i])){
                flag = hashMap.get(array[i]);
                hashMap.put(array[i] , ++flag);
            }
            else{
                hashMap.put(array[i] , 1);
            }
        }
        System.out.println(hashMap);
        Set<Map.Entry<Character, Integer>> entry = hashMap.entrySet();
        for(Integer i : hashMap.values()){
            System.out.println(i);
        }
    }
}
