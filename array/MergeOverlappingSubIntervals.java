package array;

import java.util.*;

public class MergeOverlappingSubIntervals {

    //https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/

    public static void main(String[] args) {

        ArrayList <List<Integer>> arr = new ArrayList < > ();
        arr.add(Arrays.asList(1,3));
        arr.add(Arrays.asList(2,6));
        arr.add(Arrays.asList(8,10));
        arr.add(Arrays.asList(15,18));
        ArrayList < List < Integer >> ans = merge(arr);
        System.out.println("Merged Overlapping Intervals are ");
        for (List < Integer > it: ans) {
            System.out.println(it.get(0) + " " + it.get(1));
        }
    }

    private static ArrayList<List<Integer>> merge(ArrayList<List<Integer>> intervals) {

        Collections.sort(intervals, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });

       for (List<Integer> list : intervals)
       {
           System.out.println(list.toString());
       }

        ArrayList<List<Integer>> merged = new ArrayList<> ();

        for (int i = 0; i < intervals.size(); i++)
        {
            if (merged.isEmpty() || merged.get(merged.size()-1).get(1) < intervals.get(i).get(0))
            {
                ArrayList<Integer> v = new ArrayList < > ();
                v.add(intervals.get(i).get(0));
                v.add(intervals.get(i).get(1));

                merged.add(v);
            } else {
                int temp = Math.max(merged.get(merged.size() - 1).get(1), intervals.get(i).get(1));
                merged.get(merged.size() - 1).set(1,temp);
            }
        }
        return merged;
    }
}
