package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumSwapToSortArray
{
    public static void main(String[] args)
    {

        int[] numArr = new int[]{1,5,4,3,2,5};
        //int[] numArr = new int[]{4, 5, 2, 1, 5};

        solution(numArr);


    }

    private static int solution(int[] numArr)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<numArr.length;i++)
        {
            map.put(i,numArr[i]);
        }

        int[] tempArray = Arrays.copyOf(numArr,numArr.length);
        Arrays.sort(tempArray);

        System.out.println(map);
        System.out.println(Arrays.toString(tempArray));
        System.out.println(Arrays.toString(numArr));

        int ans =0;
        for (int i=0;i<numArr.length;i++)
        {
            if (numArr[i] == tempArray[i]){
                continue;
            }

            if (numArr[i] != tempArray[i])
            {
                ans++;
                int init = numArr[i];
                //get the value and swap using the hashMap that we have
                int getSwapIndexFromNumArr = map.get(tempArray[i]);
                ArrayUtilFunctions.swapArray(numArr,i,getSwapIndexFromNumArr);
                //TODO: do we even required this
                //map.put(map.get(init),map.get(tempArray[i]));
                //map.put(map.get(tempArray[i]),i);
            }
        }

        System.out.println(Arrays.toString(numArr));
        System.out.println(ans);
        return ans;
    }
}
