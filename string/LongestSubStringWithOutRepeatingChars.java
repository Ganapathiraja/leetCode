package string;

import java.util.*;

public class LongestSubStringWithOutRepeatingChars
{
    public static void main(String[] args)
    {
        String str = "applebox";

        System.out.println(solveSolution(str));

        // hard problem
        //https://leetcode.com/problems/subarrays-with-k-different-integers/discuss/1915559/Java-Sliding-Window-Easy-Consise
    }

    private static int solveSolution(String str)
    {
        if (str == null || str.length() == 0)
        {
            return 0;
        }
        Set<Character> set = new HashSet<Character>();
        int i = 0;
        int j = 0;
        int max = 1;
        while (j < str.length())
        {
          //applebox
            while (j < str.length() && (set.isEmpty() || !set.contains(str.charAt(j))))
            {
                set.add(str.charAt(j));
                j++;
            }
            max = Math.max(max, set.size());
            set.remove(str.charAt(i));
            i++;
        }
        System.out.println(str.substring(i-1,j));
        return max;
    }
}
