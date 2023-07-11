package data;

public class TestIBS {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};

        int[] result = new int[arr1.length + arr2.length];

        int i=0 , j=0, k=0;

        while (i<arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                k++;i++;
            }
            else{
                result[k] = arr2[j];
                k++;j++;
            }
        }
        while (j < arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }

        for (int m=0;m<result.length;m++){
            System.out.print(result[m] + " ");
        }
    }
}
