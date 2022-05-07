package array;

import java.util.Arrays;

public class RotateArray
{
    public static void main(String[] args)
    {

        int[] numArr = new int[]{1,2,3,4,5,6,7,8,9,0};
        int k =3;
        k = k % numArr.length;

        ReverseNumber.reverseAnArray(numArr);
        System.out.println(Arrays.toString(numArr));

        // now reverse from start to k alone
        for (int i=0;i<(k/2);i++)
        {
            int temp = numArr[i];
            numArr[i] =  numArr[k-i-1];
            numArr[k-i-1] = temp;
        }

        System.out.println(Arrays.toString(numArr));

        // reverse from k=1 to end of array
        int end = numArr.length-1;
        for (; k < end; k++)
        {
            int temp = numArr[k];
            numArr[k] =  numArr[end];
            numArr[end] = temp;
            end--;
        }
        System.out.println(Arrays.toString(numArr));

    }
}
