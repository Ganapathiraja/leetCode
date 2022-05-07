import java.util.Arrays;

public class KthElementOf2SortedArray {
    public static void main(String[] kite) {


        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{3,4,5};
        int m = arr1.length;
        int n = arr2.length;
        int[] finalArray = new int[m+n];
        System.arraycopy(arr1,0,finalArray,0,m);

        System.out.println(Arrays.toString(finalArray));
        System.out.println(getKthElementMerge(arr1,arr2,3));
    }


    public static int getKthElementMerge(int[] list1, int[] list2, int k)
    {

        int i1 = 0, i2 = 0;

        while(i1 < list1.length && i2 < list2.length && (i1 + i2) < k)
        {
            if(list1[i1] < list2[i2])
            {
                i1++;
            } else {
                i2++;
            }
        }

        if((i1 + i2) < k)
        {
            int pos = k-i1-1;
            System.out.println(list2[pos]);
            return i1 < list1.length ? list1[k - i2 - 1] : list2[k - i1 - 1];

        } else if(i1 > 0 && i2 > 0)
        {
            return Math.max(list1[i1-1], list2[i2-1]);
        } else {
            return i1 == 0 ? list2[i2-1] : list1[i1-1];
        }
    }
}