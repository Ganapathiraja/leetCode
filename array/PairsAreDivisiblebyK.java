package array;

import java.util.HashMap;

public class PairsAreDivisiblebyK
{
    public static void main(String[] tent)
    {


        /*
        * Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
        Output: true
        Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).
        * */

        //https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/submissions/

        int[]  arr = new int[]{1,2,3,4,5,10,6,7,8,9};
        int k = 5;
        System.out.println(canArrange(arr,k));

    }

    public static boolean canArrange(int[] arr, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            int rem=i%k;
            int h=(rem+k)%k;
            System.out.println("h: "+h+" rem : "+rem);
            map.put(h,map.getOrDefault(h,0)+1);
        }

        for(int val:arr)
        {
            System.out.println(val);

            int rem=val%k;
            if(rem==0){
                int fq=map.get(rem);
                if(fq%2 != 0){
                    return false;
                }

            }else if(2*rem == k){ // optimized way for rem == k/2

                int fq=map.get(rem);

                if(fq%2 != 0){
                    return false;
                }

            }else{
                int fq=map.getOrDefault(rem,0);
                int ofq=map.getOrDefault(k-rem,0);

                if(fq != ofq) {
                    return false;
                }
            }

        }
        return true;
    }
}
