package dynamic_programming;

import java.util.Arrays;

public class FrogJumpWithKindex
{
    public static void main(String[] args)
    {

        int n = 2;
        int heights[] = new int[] { 10, 20, 30, 10 };
        int k = 2;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(solveSolutionWithK(n,heights,dp,k));

    }

    private static int solveSolutionWithK(int n, int[] heights, int[] dp,int k)
    {
        if (n==0)
            return 0;

        if (dp[n]!= -1)
        {
            return dp[n];
        }
        int minSteps=Integer.MAX_VALUE;

        for (int i=1;i<=k; i++)
        {
            if (n-i >=0)
            {
                int jump = solveSolutionWithK(n - i, heights, dp, k) + Math.abs(heights[n] - heights[n - i]);
                minSteps = Math.min(minSteps, jump);
                dp[i] = minSteps;
            }
        }
        return minSteps;
    }

}
