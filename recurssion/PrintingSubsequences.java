package recurssion;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubsequences {
    public static void main(String[] args) {

        int[] array = new int[]{3,1,2};
        int n = array.length;
        List<Integer> list = new ArrayList<>();

        printSolution(array,0,n,list);
    }

    private static void printSolution(int[] array, int start, int end, List<Integer> list) {

        if (start == end)
        {
            System.out.println(list.toString());
            return;
        }

        list.add(array[start]);
            // Subsequence without including
            // the element at current index
        printSolution(array,start+1,end,list);


        list.remove(list.size()-1);
            // Subsequence including the element
            // at current index
        printSolution(array,start+1,end,list);

    }
}
