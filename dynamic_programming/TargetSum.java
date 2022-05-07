package dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class TargetSum
{
    public static void main(String[] args)
    {

        // given a target and a numArray find if it is possible to find the target
        int target = 7;
        int[] numArr = new int[]{1,2,3,4,5,6};

        boolean result = solveRecurssiveSolutions(target,numArr);
        System.out.println(result);

        Map<Integer,Boolean> dpMap = new HashMap<>();
        boolean resultDP = solveRecurssiveUsingDpSolutions(target,numArr,dpMap);
        System.out.println(resultDP);
    }

    private static boolean solveRecurssiveUsingDpSolutions(int target, int[] numArr, Map<Integer, Boolean> dpMap)
    {
        if (target == 0) return true;

        if (target < 0 ) return false;

        if (dpMap.containsKey(target))
        {
            return dpMap.get(target);
        }

        for (int num : numArr)
        {
            int rem = target-num;
            if (solveRecurssiveUsingDpSolutions(rem,numArr,dpMap))
            {
                dpMap.put(rem,true);
                return true;
            }
        }

        dpMap.put(target,false);
        return dpMap.get(target);
    }

    private static boolean solveRecurssiveSolutions(int target, int[] numArr)
    {

        if (target == 0) return true;

        if (target < 0 ) return false;

        for (int num : numArr)
        {
            if (solveRecurssiveSolutions(target-num,numArr)){
                return true;
            }
        }

        return false;
    }
}
