package recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCombinationToTargetSumNoDuplicate {

    public static void main(String[] args) {

        int arr[] = new int[]{10,1,2,7,6,1,5};
        int length = arr.length;
        int target = 8;
        List<List<Integer>> result = new ArrayList<>();
        // to avoid duplicate just pass the hasSet
        // timeComplex 2^n * K (k is the hashSet)
        findUniqueCombinations(arr,0,length,target,result,new ArrayList<>());

        System.out.println("--------------------------");
        // definitly sort an array and then proceed
        Arrays.sort(arr);

        findUniqueCombinationsWithNoExtraSpace(arr,0,target,result,new ArrayList<>());


        for (int i = 0 ; i< 5 ;i++){

            if (i==3){
                continue;
            }
            System.out.println(i);

        }

    }



    private static void findUniqueCombinationsWithNoExtraSpace(int[] arr, int start, int target, List<List<Integer>> ans, ArrayList<Integer> dsTemp) {

        if (target == 0 )
        {
            ans.add(dsTemp);
            System.out.println(ans.toString());
            return;
        }

        for (int i=start;i<arr.length;i++)
        {
            if (i > start && arr[i] == arr[i-1])
            {
                continue;
            }

            if (arr[i] > target)
            {
                break;
            }
            dsTemp.add(arr[i]);
            findUniqueCombinationsWithNoExtraSpace(arr,i+1,target-arr[i],ans,dsTemp);
            dsTemp.remove(dsTemp.size()-1);
        }

    }

    private static void findUniqueCombinations(int[] arr, int start, int length, int target, List<List<Integer>> result, ArrayList<Integer> ds ) {

        if (start == length)
        {
            if (target == 0)
            {
                result.add(ds);
                System.out.println(result.toString());
            }
            return;
        }

        if (arr[start] <= target)
        {
            ds.add(arr[start]);
            findUniqueCombinations(arr,start+1,length,target-arr[start],result,ds);
            ds.remove(ds.size()-1);
        }
        findUniqueCombinations(arr,start+1,length,target,result,ds);
    }
}
