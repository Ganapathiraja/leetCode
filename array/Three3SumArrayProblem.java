package array;

import java.util.*;

public class Three3SumArrayProblem
{
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;

        find3Numbers(A, arr_size, sum);
        find3SumTwoPointerApproach(A);
    }

    private static void find3SumTwoPointerApproach(int[] numArr)
    {
        //  first sort the array
        Arrays.sort(numArr);

    }

    private static void find3Numbers(int[] arr, int arr_size, int target)
    {

        List<List<Integer>> list = new ArrayList<>();

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++)
        {
            // Find pair in subarray A[i+1..n-1]
            // with sum equal to sum - A[i]
            HashSet<Integer> s = new HashSet<>();
            int curr_sum = target - arr[i];
            for (int j = i + 1; j < arr_size; j++)
            {
                if (s.contains(curr_sum - arr[j]))
                {
                    List<Integer> addTriplets = new ArrayList<>();
                    addTriplets.add(arr[i]);
                    addTriplets.add(arr[j]);
                    addTriplets.add(curr_sum - arr[j]);
                    Collections.sort(addTriplets);
                    list.add(addTriplets);
                }
                s.add(arr[j]);
            }
        }
        System.out.println(list);
    }
}
