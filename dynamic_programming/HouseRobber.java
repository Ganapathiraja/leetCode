package dynamic_programming;

import java.util.Arrays;

public class HouseRobber
{
    public static void main(String[] args)
    {
        //https://www.codingninjas.com/codestudio/problems/house-robber_839733?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos


        int[] arr = new int[] { 1, 5, 1, 2, 6 };
        int size = arr.length;
        System.out.println(houseRobber(arr));
    }

    public static long houseRobber(int[] arr)
    {
        if (arr.length <= 1)
        {
            return arr[0];
        }

        if (arr.length == 2)
        {
            return Math.max(arr[0], arr[1]);
        }


        long dp[] = new long[arr.length];
        Arrays.fill(dp, -1);
        int firstGone[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++)
        {
            firstGone[i - 1] = arr[i];
        }
        //not taking 0th element
        long ans1 = solve(firstGone, firstGone.length - 1, dp);
        System.out.println(Arrays.toString(dp));
        Arrays.fill(dp, -1);


        int lastGone[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++)
        {
            lastGone[i] = arr[i];
        }
        //not taking last element
        long ans2 = solve(lastGone, lastGone.length - 1, dp);

        return Math.max(ans1, ans2);
    }


    public static long solve(int arr[], int ind, long dp[])
    {
        if (ind < 0)
        {
            return 0;
        }

        if (dp[ind] != -1)
        {
            return dp[ind];
        }

        if (ind == 0)
        {
            dp[ind] = arr[ind];
            return dp[ind];
        }
        // if ith is taken then i-2 can be taken
        // if ith is not taken than i-1 can be taken
        return dp[ind] = Math.max(arr[ind] + solve(arr, ind - 2, dp), solve(arr, ind - 1, dp));
    }
}