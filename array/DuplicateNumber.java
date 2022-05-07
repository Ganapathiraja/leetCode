package array;

public class DuplicateNumber
{
    public static void main(String[] args)
    {

        int[] numArr = new int[] {1,2,3,4,5,6,1};

        // staring number that make this duplicate
        System.out.println(solveSolution(numArr));
    }

    private static int solveSolution(int[] numArr)
    {
        int slow = numArr[0];
        int fast = numArr[0];

        do
        {
            slow = numArr[slow];
            fast = numArr[numArr[fast]];
        } while (slow!=fast);

        fast = numArr[0];
        while (slow!=fast)
        {
            slow = numArr[slow];
            fast = numArr[fast];
        }
        return slow;
    }
}
