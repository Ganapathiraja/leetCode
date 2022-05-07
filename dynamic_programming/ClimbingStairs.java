package dynamic_programming;

import java.util.Arrays;

public class ClimbingStairs
{
    //https://www.codingninjas.com/codestudio/problems/count-ways-to-reach-nth-stairs_798650?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos


    public static void main(String[] args)
    {

        // 1D array problem and how to understand how this is related to DP problem ,
        // few guesses are like
        // count the total no of waYS
        //min AND max
        // try all possible ways then definilty it's recurssion
        // best way to find then we use recurssion


        int stairs = 3;
        int[] dp  = new int[stairs+1];
        Arrays.fill(dp,-1);

        System.out.println(Arrays.toString(dp));
        System.out.println(solveSolutoin(stairs,dp));
    }

    private static int solveSolutoin(int stairs, int[] dp)
    {

        if (stairs == 0 || stairs == 1)
            return 1;

        if(stairs>1)
        {
            if (dp[stairs] != -1)
                return dp[stairs];
        }
        int oneJump = solveSolutoin(stairs-1,dp);
        int twoJump=0;

        if(stairs>1){

            twoJump=solveSolutoin(stairs-2,dp);

        }

        return dp[stairs] = (oneJump+twoJump);
    }
}
