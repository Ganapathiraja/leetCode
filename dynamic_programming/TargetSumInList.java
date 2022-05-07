package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class TargetSumInList
{
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args)
    {

        // this is a combination sum

        int targetSum = 8;
        int[] numArr = new int[] { 2, 3, 5 };
        List<Integer> list = new ArrayList<>();
        solveSolutionUsingRecurssion(0, targetSum, numArr, list);
        System.out.println(result);
    }


    private static void solveSolutionUsingRecurssion(int start, int targetSum, int[] numAr, List<Integer> temp)
    {

        if (targetSum == 0)
        {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (targetSum < 0)
        {
            return;
        }
        if (start == numAr.length)
        {
            return;
        }

        solveSolutionUsingRecurssion(start + 1, targetSum, numAr, temp);
        temp.add(numAr[start]);
        solveSolutionUsingRecurssion(start, targetSum - numAr[start], numAr, temp);
        temp.remove(temp.size() - 1);
    }
}
