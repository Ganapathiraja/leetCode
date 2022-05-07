package array;

import java.util.Arrays;

public class Merge2SortedArray {
    public static void main(String[] args) {

        int arr1[] = {1,4,7,8,10};
        int arr2[] = {2,3,9};
        System.out.println("Before merge:");

        merge(arr1,arr2,arr1.length,arr2.length);

        int arr3[] = {1,4,7,8,10};
        int arr4[] = {2,3,9};
        mergeWithExtraSpace(arr3,arr4,arr3.length,arr4.length);

    }

    private static void mergeWithExtraSpace(int[] arr1, int[] arr2, int n, int m)
    {

        int i=0,j=0,k=n-1;

        while (i<=k&& j <m)
        {
            if (arr1[i] < arr2[j])
            {
                i++;
            }else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

    private static void merge(int[] arr1, int[] arr2, int n, int m) {

        int i, k;
        for (i = 0; i < n; i++) {
            // take first element from arr1
            // compare it with first element of second array
            // if condition match, then swap
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }

            // then sort the second array
            // put the element in its correct position
            // so that next cycle can swap elements correctly
            int first = arr2[0];
            // insertion sort is used here
            for (k = 1; k < m && arr2[k] < first; k++) {
                arr2[k - 1] = arr2[k];
            }
            arr2[k - 1] = first;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
