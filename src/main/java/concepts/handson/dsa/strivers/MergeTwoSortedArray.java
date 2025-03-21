package concepts.handson.dsa.strivers;

import java.util.Arrays;

public class MergeTwoSortedArray
{

    public static void main(String[] args) {

        int [] arr1 = {1,3,5,7};
        int [] arr2 = {2,4,6,8,10, 11, 12, 13};

        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));

    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0, k = 0;

        int mergedArray[] = new int [m+n];

        while(i<m && j<n)
        {
            if(arr1[i] <= arr2[j]){
                mergedArray[k++] = arr1[i++];
            }else{
                mergedArray[k++] = arr2[j++];
            }
        }

        while(i < m){
            mergedArray[k++] = arr1[i++];
        }

        while(j < n){
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;

    }
}
