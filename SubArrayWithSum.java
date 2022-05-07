import java.util.ArrayList;
import java.util.List;

public class SubArrayWithSum
{
    public static void main(String[] mcs)
    {

        int[] arr = new int[]{1,2,3,7,5};
        int n = arr.length;
        int sum = 12;

        List<Integer> result = new ArrayList<>();
         solveSOlution(arr,n,sum,result);

        System.out.println(result);

        // so from index 1 to 3 if we add the nums then the SUM will we be our target


    }

    private static void solveSOlution(int[] arr, int n, int N, List<Integer> result)
    {
        int i=0,j=0;
        int sum = arr[0];  // 1,2,3,7,5

        while (j < n)
        {
            if (N == sum)
            {
                result.add(i);
                result.add(j);
                return;
            }

            if (sum < N)
            {
                j++;
                sum +=arr[j];
                continue;
            }

            if (sum > N)
            {
                sum -= arr[i];
                i++;
                continue;
            }

        }

        result.add(-1);

    }
}
