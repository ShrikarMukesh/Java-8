package org.elevens;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        // rupee 10 --> change = 5 * 2 = 10
        // rupee 10 --> change = 1 * 10 = 10
        // rupee 10 --> change = 2 * 5 = 10
        int target = 10;
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();

        for(int i=1;i< 10;i++){
            int res = findDinamination(i, target);
            integerHashMap.put(i, res);
        }
        System.out.println(integerHashMap);
    }

    private static int findDinamination(int i, int target) {

        int flag = 0;
        int counter = i;
        while ( counter <= target){
            if(counter <= target){
                counter = counter + i;
            }
            flag++;
        }
        return flag;
    }
}
