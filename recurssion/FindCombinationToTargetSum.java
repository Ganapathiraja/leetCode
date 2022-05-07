package recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindCombinationToTargetSum {

    // given an array find the target by using the same number anytimes
    // example array [2,3,6,7] target = 7 , combinations are [2,2,3],[7] , so here you see you are allowed to take the the num `2` multiple times


    public static void main(String[] args) {

        // given inputs
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        // combination sum *****
        findCombinations(candidates,0,candidates.length,target,result,new ArrayList<>());


        // happy number sum problem
        System.out.println(getNext(100));



    }

    private static void findCombinations(int[] candidates, int start, int length, int target, List<List<Integer>> result,List<Integer> ds) {

        if (start == length){
            if (target == 0){
                result.add(ds);
                System.out.println("The result is :: "+result.toString());
            }
            return;
        }

        if (candidates[start] <= target){
            ds.add(candidates[start]);
            findCombinations(candidates,start,length,target-candidates[start],result,ds);
            ds.remove(ds.size()-1);
        }

        findCombinations(candidates,start+1,length,target,result,ds);
    }

    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }


}
