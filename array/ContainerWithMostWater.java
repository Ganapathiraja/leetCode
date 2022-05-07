package array;

public class ContainerWithMostWater
{
    public static void main(String[] args)
    {
        /// intput is as [1,5,4,3] , o/t: 6 , so this is saying as 5 and 3 are dsitant of 2 apart and
        // heigh of the container is min of (5,3) then the area is 3*2 ==6
        int[] numArr = new int[] { 1, 5, 4, 3 };
        solveSolution(numArr);
    }

    private static void solveSolution(int[] numArr)
    {
        int start = 0, end = numArr.length - 1;
        int maxArea = 0;
        while (start < end)
        {
            int area = (end - start) * Math.min(numArr[start], numArr[end]);
            maxArea = Math.max(maxArea, area);

            if (Math.min(numArr[start], numArr[end]) == numArr[start])
            {
                start++;
            }
            else
            {
                end--;
            }
        }

        System.out.println(maxArea);
    }
}
