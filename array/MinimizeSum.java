package array;

import java.util.PriorityQueue;

public class MinimizeSum
{
    //1,4,7,10 keep adding the samll no and then again sort and do the same and sum it to ans every move
    //https://www.youtube.com/watch?v=F_ReiTGOpmg

    public static void main(String[] args)
    {

        int[] numArr = new int[]{1,4,7,10};

        solveSolution(numArr);

    }

    private static void solveSolution(int[] numArr)
    {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : numArr)
        {
            priorityQueue.add(num);
        }

        int ans = 0;
        while (priorityQueue.size() > 1)
        {
            int firstMin = priorityQueue.peek();
            priorityQueue.poll();
            int secondMin = priorityQueue.peek();
            priorityQueue.poll();
            ans += firstMin+secondMin;
            priorityQueue.add(firstMin+secondMin);
        }

        System.out.println(ans);
    }
}
