package array;

import java.util.Arrays;

public class ConvertArrayIntoZigZag
{
    public static void main(String[] args)
    {
        int[] numArr = new int[]{4,3,7,8,6,2,1};
        //o/t: 3,7,4,8,2,6,1
        solveSolutoin(numArr);
        System.out.println(Arrays.toString(numArr));
    }

    private static int[] solveSolutoin(int[] numArr)
    {
        int flag =1;

        for (int i=0;i<numArr.length-1;i++)
        {
            if (flag == 1)
            {
                if (numArr[i]>numArr[i+1])
                {
                    swap(numArr,i,i+1);
                }
                flag--;
            }else {
                if (numArr[i] < numArr[i+1]){
                    swap(numArr,i,i+1);
                }
                flag++;
            }

        }
        return numArr;
    }

    private static void swap(int[] numArr, int i, int j)
    {
        int temp = numArr[i];
        numArr[i] = numArr[j];
        numArr[j] = temp;
    }
}
