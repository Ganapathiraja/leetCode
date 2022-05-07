package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/discuss/1937670/Java-Sliding-Window
public class MinOperations
{
    public static void main(String[] args)
    {

        int[] nums = new int[] { 4, 2, 5, 3 };

        //Input: nums = [1,2,3,5,6]
//        Input: nums = [4,2,5,3]

        int N = nums.length;
        // Make the input sorted + unique first
        Set<Integer> unique = new HashSet();
        for (int n : nums)
        {
            unique.add(n);
        }
        int[] sorted = new int[unique.size()];
        int id = 0;
        for (int n : unique)
        {
            sorted[id++] = n;
        }
        Arrays.sort(sorted);
        int M = sorted.length; // pointer sorted Length
        System.out.println(Arrays.toString(sorted));
        int ans = N;
        int j = 0; // pointer J
        for (int i = 0; i < M; i++)
        {
            int curr = sorted[i];// Consider curr element as the starting element of sequence
            int end = curr + N - 1;// Then this would be end element of sequence
            // Find total number already present in this range of [curr,end] in sorted array

            while (j < M && sorted[j] <= end)
            {
                j++;// As array is sorted, so j would be defntly greater for next element(i++) iteration, so we don't reset j
            }
            int numberLeft = N - j + i;
            ans = Math.min(ans, numberLeft);
        }
        System.out.println(ans);
    }
}
