package array;

public class BuyAndSellStock
{
    public static void main(String[] args)
    {

        int[] numArr = new int[]{7,1,5,3,6,4};

        int maxRight = numArr[numArr.length-1];
        int maxProfit=0;
        int n = numArr.length;

        for (int i= n-2;i >=0;i--)
        {
            maxRight = Math.max(maxRight,numArr[i]);
            maxProfit = Math.max(maxProfit,maxRight-numArr[i]);
        }


        System.out.println(maxProfit);

    }
}
