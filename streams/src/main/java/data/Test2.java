package data;
/*
Check if a List of integers contains only odd numbers
Note: if all integers in the list are odd number return true if any one number is even number in the list return false.
e.g:
[1,2,3,4] – false
[1,3,4] - false
[1,3,5,7,9] – true
[15,21,9] - true
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        boolean res = checkOdd(arr);
        System.out.println(res);
    }

    private static boolean checkOdd(int[] arr) {
        for (int i=0;i<arr.length;i++){
            if (arr[i] % 2 ==0){
                return false;
            }
        }
        return true;
    }
}
