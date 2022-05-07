package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalindromicSubString
{
   static int maxLengthOfSubString=0;
    public static void main(String[] args)
    {

        String str = "google";
        Set<String> set = new HashSet<>();
        solveSolution(str,set);

        System.out.println(set);
        System.out.println("Max length is ::  "+maxLengthOfSubString);



    }


    private static void solveSolution(String str, Set<String> set)
    {



        for (int i=0;i<str.length();i++)
        {
            isPalindromicSubString(str,i,i,set);
            isPalindromicSubString(str,i,i+1,set);
        }
    }

    private static void isPalindromicSubString(String str, int left, int right, Set<String> set)
    {

        while ( (left >=0 && right < str.length()) && (str.charAt(left) == str.charAt(right)))
        {
            set.add(str.substring(left,right+1));
            if (str.substring(left,right+1).length() > maxLengthOfSubString)
            {
                maxLengthOfSubString = str.substring(left,right+1).length();
            }
            left--;
            right++;
        }

    }

    public static int[] twoSum(int[] nums, int target) {


        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++)
        {
            int diff = target - nums[i];

            if (map.containsKey(diff))
            {
                return new int[]{i,map.get(diff)};
            }
            map.put(nums[i],i);
        }

        return new int[]{};
    }
}
