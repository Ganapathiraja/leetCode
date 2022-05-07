package dynamic_programming;

import java.util.Arrays;

public class FrogJump
{

    //https://www.codingninjas.com/codestudio/problems/frog-jump_3621012?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
    public static void main(String[] args)
    {
        int n = 2;
        int heights[] = new int[] { 10, 20, 30, 10 };


        // this is recursive solutions
        System.out.println(frogJumpRecursions(n, heights));

        // this is dp solution
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(frogJumpWithDp(n, heights, dp));
    }

    private static int frogJumpWithDp(int n, int[] heights, int[] dp)
    {
        if (n == 0)
        {
            return 0;
        }

        if (dp[n] != -1)
        {
            return dp[n];
        }

        int left = frogJumpWithDp(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);
        int right = Integer.MAX_VALUE;
        if (n > 1)
        {
            right = frogJumpWithDp(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]);
        }

        return dp[n] = Math.min(left, right);
    }

    private static int frogJumpRecursions(int n, int[] heights)
    {
        if (n == 0)
        {
            return 0;
        }

        int left = frogJumpRecursions(n - 1, heights) + Math.abs(heights[n] - heights[n - 1]);
        int right = Integer.MAX_VALUE;

        if (n > 1)
        {
            right = frogJumpRecursions(n - 2, heights) + Math.abs(heights[n] - heights[n - 2]);
        }

        return Math.min(left, right);
    }
}
