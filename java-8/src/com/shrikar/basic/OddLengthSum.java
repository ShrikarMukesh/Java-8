package com.shrikar.basic;

public class OddLengthSum {
    static int OddLengthSum(int[] arr){

        // Stores the sum
        int sum = 0;

        // Size of array
        int l = arr.length;

        // Traverse the array
        for(int i = 0; i < l; i++)
        {

            // Generate all subarray of
            // odd length
            for(int j = i; j < l; j += 2)
            {
                for(int k = i; k <= j; k++)
                {

                    // Add the element to sum
                    sum += arr[k];
                }
            }
        }

        // Return the final sum
        return sum;
    }

    // Driver Code
    public static void main (String[] args)
    {

        // Given array arr[]
        int[] arr = { 1, 5, 3, 1, 2 };

        // Function call
        System.out.print(OddLengthSum(arr));
    }
}
