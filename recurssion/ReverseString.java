package recurssion;

public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "hello";

        System.out.println(solveSolution(str));
    }

    private static String solveSolution(String str)
    {

        if (str.equals(""))
            return "";

        return solveSolution(str.substring(1)) + str.charAt(0);
    }
}
