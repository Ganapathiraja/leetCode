package array;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive
{
    public static void main(String[] args)
    {

        int[] numArr = new int[]{100,4,200,1,3,2};

        solveSolution(numArr);

    }

    private static void solveSolution(int[] numArr)
    {

        Set<Integer> set = new HashSet<>();
        for (int num : numArr)
        {
            set.add(num);
        }

        int maxNum = 0;

        for (int num : set)
        {
            if (!set.contains(num-1))
            {
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum+1))
                {
                    currentNum +=1;
                    currentStreak +=1;
                }
                maxNum = Math.max(maxNum,currentStreak);
            }
        }

        System.out.println(maxNum);
    }
}
