package array;

import java.util.Arrays;

public class MoveNegativeEleToSideOfArray
{
    public static void main(String[] args)
    {
        int[] numsArr = new int[] { -12, 11, -13, -5, 6, -7, 5 };
        int i = 0, j = numsArr.length - 1;
        Solution(numsArr, i, j);
        System.out.println(Arrays.toString(numsArr));
    }

    private static void Solution(int[] numsArr, int i, int j)
    {
        while (i < j)
        {
            if (numsArr[i] < numsArr[j])
            {
                j--;
                i++;
            }
            if (numsArr[i] > numsArr[j])
            {
                swap(numsArr, i, j);
                i++;
                j--;
            }
        }
    }

    private static void swap(int[] numsArr, int i, int j)
    {
        int temp = numsArr[i];
        numsArr[i] = numsArr[j];
        numsArr[j] = temp;
    }
}
