package array;

public class SearchInRotatedArray
{
    public static void main(String[] args)
    {

        //https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

        int[] numArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }; // rotated with value 3

        // ARRAY WILL COME IN ROTATEED ORDER
        int[] arr = new int[] { 8, 9, 0, 1, 2, 3, 4, 5, 6, 7 };
        int target = 4;

        // we can do a linear search and search but this will be like O(n)
        System.out.println(searchTheTarget(arr, target));
    }

    private static boolean searchTheTarget(int[] nums, int target)
    {
        int left = 0, right = nums.length - 1;

        while (left <= right)
        {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
            {
                return true;
            }                 // this is that special case we were talking about.
            else if (nums[left] == nums[mid] && nums[right] == nums[mid])
            {
                left++;
                right--;
            }
            // mid lies in the first half then we compare with target and move the l r
            else if (nums[left] <= nums[mid])
            {
                if (nums[left] <= target && nums[mid] > target)
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            // mid lies in the second half then we compare with target and move the l r
            else
            {
                if (nums[mid] < target && nums[right] >= target)
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
