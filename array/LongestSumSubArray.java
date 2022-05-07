package array;

import java.util.Map;

public class LongestSumSubArray
{
    public static void main(String[] args)
    {
        // kadanes algo
        int[] arr = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};

        int max_soFar = Integer.MIN_VALUE;
        int currentSum =  0;

        for (int i=0;i<arr.length;i++)
        {
            currentSum = currentSum +arr[i];

            max_soFar = Math.max(max_soFar,currentSum);

            //if currentSum is always -ve then make the currSum to 0
            if (currentSum < 0)
            {
                currentSum = 0;
            }
        }

        System.out.println(max_soFar);

    }
}
