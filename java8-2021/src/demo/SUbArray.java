package demo;

public class SUbArray {
    public static void main(String[] args) {
        int[] a = {9,3,4,5,6,7};
        int[] subArray = new int[2];
        //subArray = findSubArray(a);
        System.out.println(subArray.length);



    }
    private static void  findSubArray(int[] array){
        int maxSum =0;
        for(int i=0;i<array.length;i++){

            int flag1 = array[i];
            for(int j=0;j<array.length;j++){
                flag1 = flag1+array[j];
                int result = check(flag1,array[j],maxSum);
                maxSum = result;
            }
        }
        return maxSum;
    }
    private static int check(int flag1, int i,int maxSum) {
        if(maxSum < flag1+i){
            return flag1+1;
        }
        return maxSum;
    }
}
