package stack;

import java.util.Stack;

public class EvaluateExpression
{
    public static void main(String[] args)
    {
        char[] numChar = new char[]{'2','1','+','3','*'};
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<numChar.length;i++)
        {
            if (Character.isDigit(numChar[i]))
            {
                stack.push(numChar[i]);
            }else {
                int a = stack.pop();
                int b = stack.pop();
            }
        }
    }
}
