package array;

import java.util.HashMap;
import java.util.Map;

public class BeautifulNumbers
{

    //https://www.hackerearth.com/problem/algorithm/beautiful-numbers-05de0f51-101121ca/
    public static void main(String[] args)
    {

        int l = 6334 , r = 15724;
        
        solveSolution(l,r);


    }

    private static long solveSolution(int l, int r)
    {

        Map<Integer,Integer> dpMap = new HashMap<>();
        int m = l;
        int n = r;
        while(m<n)
        {

            if (dpMap.get(m)!=null){
                m = dpMap.get(m);
            }else {
                int tempM = giveNextSquareNum(m);
                dpMap.put(m, tempM);
                m = tempM;
            }

            if (dpMap.get(n)!=null){
                n = dpMap.get(n);
            }else {
                int tempN = giveNextSquareNum(n);
                dpMap.put(n, tempN);
                n = tempN;
            }
        }

        if(m==1 || n==1){
            System.out.println("beautifulNumber");
            return l+r;
        }else{
            System.out.println(l);
            return l;
        }

    }


    private static int giveNextSquareNum(int n){

        int totalSum = 0;

        while (n > 0)
        {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }

        return totalSum;
    }
}
