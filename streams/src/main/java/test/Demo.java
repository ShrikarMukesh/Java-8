package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3, 4, 5, 6, 8,-1,-2,-3};
        //int[] arr = {-1, -2, -3, 5, 3, 4, 5, 6, 8};
        int count =  findConsicutiveSeq(arr);
        System.out.println(count);

    }

    private static int findConsicutiveSeq(int[] arr) {

        ArrayList<Integer> integers = new ArrayList<>();


        StringBuilder stringBuilder = new StringBuilder();

        List<String> strings = new ArrayList<>();

        for (int i=0;i<arr.length -1 ;i++){
            if(arr[i] < 0){
                boolean flag  = checkseqNeg(arr[i], arr[i + 1]);
                if (flag) {
                    integers.add(arr[i]);
                    stringBuilder.append(arr[i]);
                } else {
                    //stringBuilder.append(arr[i]);
                    strings.add(stringBuilder.toString());
                    stringBuilder.delete(0, stringBuilder.length());
                }
            }else {
                boolean flag = checkseq(arr[i], arr[i + 1]);
                if (flag) {
                    integers.add(arr[i]);
                    stringBuilder.append(arr[i]);
                } else {
                    //stringBuilder.append(arr[i]);
                    strings.add(stringBuilder.toString());
                    stringBuilder.delete(0, stringBuilder.length());
                }
            }
        }
        strings = strings.stream().filter( s -> !s.isBlank()).collect(Collectors.toList());
        System.out.println(strings);
        return strings.size();

    }

    private static boolean checkseqNeg(int i, int i1) {
        if(i > i1){
            return true;
        }
        return false;
    }

    private static boolean checkseq(int i, int i1) {
        if( i < ++i1){
            return true;
        }
        return false;
    }
}
