package array;

public class MedianOf2SortedArray
{
    public static void main(String[] args)
    {
        //https://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/
        //int[] arr1 = new int[] { 1, 3 };
        //int[] arr2 = new int[] { 2 };


        int[] arr1 = { 1,2,3,4,5 };
        int[] arr2 = { 6,7,8,9,10};



        // this is like to find the median of 2 sorted array
        //https://www.youtube.com/watch?v=5qDN3ZDtyWg

        double result = findMedian(arr1, arr2);
        System.out.println(result);
    }

    private static double findMedian(int[] A, int[] B)
    {
        int n = A.length;
        int m = B.length;
        if (n > m)
        {
            return findMedian(B, A); // Swapping to make A smaller
        }

        int start = 0;
        int end = n;
        int realmidinmergedarray = (n + m + 1) / 2;

        while (start <= end)
        {
            // 1 2 3 4 5 // mid ku left ele
            //6 7 8 9 10 // mid ku right ele
            int curr1 = (start + end) / 2;
            int curr2 = realmidinmergedarray - curr1;

            int leftA = (curr1 > 0) ? A[curr1 - 1] : Integer.MIN_VALUE; // checking overflow of indices
            int leftB = (curr2 > 0) ? B[curr2 - 1] : Integer.MIN_VALUE;

            int rightA = (curr1 < n) ? A[curr1] : Integer.MAX_VALUE;
            int rightB = (curr2 < m) ? B[curr2] : Integer.MAX_VALUE;

            // if correct partition is done
            if (leftA <= rightB && leftB <= rightA)
            {
                if ((m + n) % 2 == 0)
                {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                }
                return Math.max(leftA, leftB);
            }
            else if (leftA > rightB)
            {
                end = curr1 - 1;
            }
            else
            {
                start = curr1 + 1;
            }
        }
        return 0.0;
    }
}
