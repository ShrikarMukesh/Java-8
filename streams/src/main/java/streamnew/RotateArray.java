package streamnew;
/*
rotate array by K times (right)
Input: Array[] = {2, 5, 7, 7, 9}, K = 2.
Output: 7 9 2 5 7
rotate using same array
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 7, 9};
        int rotations = 2;
        int[] res = rotateArrayFunction(arr, rotations);
        System.out.println("****************");
        for (int h : res){
            System.out.print(h+" ");
        }
    }

    private static int[] rotateArrayFunction(int[] arr, int times) {
        int last = 0;
        int[] res = new int[arr.length];

        for (int k=1;k<= 1;k++){
            last = arr[arr.length-1];
            for (int i=0;i<res.length;i++){
                res[i] = arr[i];
            }
            res[0] = last;
            for (int l: res){
                System.out.print(l+" ");
            }
        }
        return arr;
    }
}
