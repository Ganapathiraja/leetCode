package array;

public class ArrayUtilFunctions
{
    public static void main(String[] args)
    {
        swapArray(new int[]{},0,0);
    }

    public static int[] swapArray(int num[],int i,int j)
    {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
        return num;

    }
}
