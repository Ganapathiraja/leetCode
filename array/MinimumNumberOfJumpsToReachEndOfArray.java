package array;

public class MinimumNumberOfJumpsToReachEndOfArray
{
    public static void main(String[] args)
    {

        int[] numArr = new int[] { 1,3,4,2,2 };

        int steps = numArr[0];
        int maxReach = numArr[0];
        int jump = 0;

        System.out.println( solution(numArr, steps, maxReach, jump));

    }


    private static int solution(int[] numArr, int steps, int maxReach, int jump)
    {
        if (numArr[0] ==0){
            return -1;
        }
        int n = numArr.length;

        for (int i = 0; i < n; i++)
        {
            maxReach = Math.max(maxReach, i + numArr[i]);
            steps--;
            if (steps == 0)
            {
                jump++;
                if (i > maxReach)
                {
                    return -1;
                }
                steps = maxReach - i;
            }
        }

        return jump;
    }
}
