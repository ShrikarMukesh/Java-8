package test;

import java.util.HashMap;

/*
Input : UDRR
Output : [2,0]
Ex2 :
Input : DD
Output : [0,-2]
 */
public class Test {
    public static void main(String[] args) {

        int a = -1 + -1;
        System.out.println(a);
        String str = "LRUD";
        findCoordinate(str);
    }

    private static void findCoordinate(String str) {
//        HashMap<Character, Integer> coordinates = new HashMap<>();
//        coordinates.put('U', 1); coordinates.put('D', -1);
//        coordinates.put('R', 1); coordinates.put('L', -1);

        int[] result = new int[2];

        result[0] = 0;
        result[1] = 0;

        for (char c : str.toCharArray()){
            //Up-Down scenario
            if(c== 'U'){
                result[0] = result[0] + 1;
            }else if((c== 'D')) {
                result[0] = result[0] - 1;
            }

            //R-L scenario
            if(c== 'R'){
                result[1] = result[1] + 1;
            }else if((c== 'L')) {
                result[1] = result[1] - 1;
            }

        }

        System.out.println("The Res = " + result[0] + " "+ result[1]);
     }
}
//Time Comp : O(N)
