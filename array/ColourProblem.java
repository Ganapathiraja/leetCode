package array;

import java.util.Arrays;

public class ColourProblem
{
    public static void main(String[] args)
    {

        // sort an given array such that all 0's come to start of array and all 2's goes to end of array and all 1's are in middle of the array
        int[] numArr = new int[] { 1, 2, 0, 1, 2, 0, 0 };
        solveSolution(numArr);
    }

    private static void solveSolution(int[] numArr)
    {
        int end = numArr.length - 1;
        int start = 0; // keep track of the position to sort the array
        int i = 0;

        while (i <= end)
        {
            if (numArr[i] == 0)
            {
                ArrayUtilFunctions.swapArray(numArr, i, start);
                start++;
            }
            if (numArr[i] == 2)
            {
                ArrayUtilFunctions.swapArray(numArr, i, end);
                end--;
                continue;
            }
            i++;
        }

        System.out.println("My fav solution: {} "+Arrays.toString(numArr));
    }


    public  static void sortSolution(){
        // sort array of 1's,2's,0's
        int[] array = new int[]{1,2,1,2,0,0,0,1};
        //Arrays.sort(array);
        //System.out.println(Arrays.toString(array));

        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for (int i=0;i<array.length;i++){

            if (array[i]==0){
                count_0++;
            }else if (array[i]==1){
                count_1++;
            }else if (array[i]==2){
                count_2++;
            }
        }

        System.out.println(count_0+" "+count_1+" "+count_2);

        // manipulate array
        for (int i=0;i<array.length;i++){

            if (count_0 != 0){
                array[i] = 0;
                count_0 --;
            }else if (count_1 != 0){
                array[i] = 1;
                count_1--;
            }else if (count_2 != 0){
                array[i] = 2;
                count_2--;
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
