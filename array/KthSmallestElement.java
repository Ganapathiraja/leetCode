package array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement
{
    public static void main(String[] trim)
    {

        int[] arr = new int[]{7,10,4,3,20,15};

        int k = 3;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int num :arr)
        {
            System.out.println(num);
            priorityQueue.add(num);
            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }

        System.out.println("Result is {} "+priorityQueue.peek());
    }
}
