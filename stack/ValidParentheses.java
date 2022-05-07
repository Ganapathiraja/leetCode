package stack;

import java.util.Stack;

public class ValidParentheses
{
    public static void main(String[] args)
    {


        String s = "()[]{}";
        //String s = "]";
        //String s = ")(){}";
        //String s = "()";

        System.out.println(isValid(s));
    }

    private static boolean isValid(String s)
    {
        if (s.length() == 1)
        {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        // (){}[]
        for (char ch : s.toCharArray())
        {
            if (ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                char closeChar = stack.pop();

                if (closeChar != '(' && ch == ')')
                {
                    return false;
                }
                if (closeChar != '{' && ch == '}')
                {
                    return false;
                }
                if (closeChar != '[' && ch == ']')
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
