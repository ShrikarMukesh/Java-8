package first;

public class Test2 {
    public static void main(String[] args) {
        int[] nums  = {0,1,0,3,12};
        int count = 0;
        for(int i=0;i<nums.length;i++){
           if(nums[i] !=0){
               nums[count++] = nums[i];
           }
        }
        // Make all elements 0 from count to end.
        while (count < nums.length)
            nums[count++] = 0;
        for (int n : nums){
            System.out.println(n);
        }
    }
}
