package array;

import java.util.Arrays;

public class ReverseNumber
{

    public static void main(String[] args)
    {

        int[] numArr = new int[]{5,4,3,2,1};
        reverseAnArray(numArr);
        System.out.println(Arrays.toString(numArr));
    }

  public static int[] reverseAnArray(int[] numArr){
        int n = numArr.length;
        for (int i =0 ; i<n/2;i++)
        {
            int temp = numArr[i];
            numArr[i] = numArr[n-i-1];
            numArr[n-i-1] = temp;
        }
        return numArr;
    }

}
