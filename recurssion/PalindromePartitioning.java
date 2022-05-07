package recurssion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning
{
    // a palindrome string is a string that reads backwards as well as forward
    // input s=aab
    // output = [ ["a","a","b"], ["aa","b"] ]

    public static void main(String[] args)
    {

        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        String str = "aab";
        solution(0,str,path,result);
        System.out.println(result.toString());

    }

    private static void solution(int index, String str, List<String> path, List<List<String>> result)
    {
        if (index == str.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i= index ; i < str.length(); ++i)
        {
            if (isPalindrome(str,index,i))
            {
                path.add(str.substring(index,i+1));
                solution(i+1,str,path,result);
                path.remove(path.size()-1);
            }

        }
    }

    private static boolean isPalindrome(String str, int start, int end)
    {
        while (start <= end)
        {
            if (str.charAt(start++) != str.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
}
