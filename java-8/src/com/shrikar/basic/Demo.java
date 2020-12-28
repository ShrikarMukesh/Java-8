package com.shrikar.basic;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int []index = {0,1,2,2,1};
        int[] resultArray = createTargetArray(nums,index);
        for(int k:resultArray){
            System.out.println(k);
        }

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0,j=0;i<nums.length &&j<index.length;i++,j++){
            list.add(index[i],nums[j]);
        }

        return  list.stream().mapToInt(i -> i).toArray();

    }
}
