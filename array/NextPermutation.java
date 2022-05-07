package array;

import java.util.Arrays;

public class NextPermutation
{

    //https://leetcode.com/problems/next-permutation/

    public static void main(String[] args)
    {

        //int[] numArr = new int[]{1,3,2};   // ot/ 213
        //int[] numArr = new int[]{3,2,1};
        int[] numArr = new int[] { 2, 3, 1 };
        solveSolution(numArr, numArr.length);
    }

    private static void solveSolution(int[] numArr, int length)
    {

        if (numArr.length == 1)
        {
            return;
        }

        int idx1 = 0;
        int count = 0;

        for (int i = numArr.length - 2; i >= 0; i--)
        {
            if (numArr[i] < numArr[i + 1])
            {
                idx1 = i;
                count++;
                break;
            }
        }

        if (count == 0)
        {
            ReverseNumber.reverseAnArray(numArr);
            System.out.println(Arrays.toString(numArr));
        }
        else
        {
            int idx2 = 0;
            for (int i = numArr.length - 1; i >= 0; i--)
            {
                if (numArr[i] > numArr[idx1])
                {
                    idx2 = i;
                    break;
                }
            }

            ArrayUtilFunctions.swapArray(numArr, idx1, idx2);
            Arrays.sort(numArr, idx1 + 1, numArr.length);
            System.out.println(Arrays.toString(numArr));
        }
    }
}
