package recurssion;



import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutation {
    public static void main(String[] args) {

        int[] nums = new int[]{3,1,2};
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        List<Integer> ds = new ArrayList<>();

        // n!*n TIME COMP
        // O(N) + O(N) SPACE COMP
        findAllPermutation(nums,freq,ds,ans);

        System.out.println(ans.toString());

        // another way is to use swap, reCurr, swap wala method


    }

    private static void findAllPermutation(int[] nums, boolean[] freq, List<Integer> ds, List<List<Integer>> ans) {

        if (ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i=0;i<nums.length;i++)
        {
            if (!freq[i])
            {
                freq[i] = true;
                ds.add(nums[i]);
                findAllPermutation(nums,freq,ds,ans);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }


    }
}
