package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class MedianOfStream
{
    // assume it to be like continuous stream for numbers are flowing into the stream
    final Queue<Integer> maxHeap;
    final Queue<Integer> minHeap;

    public MedianOfStream()
    {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public double findMedian()
    {
        int median;

        if (minHeap.size() < maxHeap.size())
        {
            median = maxHeap.peek();
        }
        else if (minHeap.size() > maxHeap.size())
        {
            median = minHeap.peek();
        }
        else
        {
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        }
        return median;
    }

    public void add(int num)
    {
        if (!minHeap.isEmpty() && num < minHeap.peek())
        {
            maxHeap.add(num);
            if (maxHeap.size() > minHeap.size() + 1)
            {
                minHeap.add(maxHeap.poll());
            }
        }
        else
        {
            minHeap.add(num);
            if (minHeap.size() > maxHeap.size() + 1)
            {
                maxHeap.add(minHeap.poll());
            }
        }
    }
}


public class MedianOfRunningStreamOfIntegers
{
    public static void main(String[] args)
    {
        //int[] numArr = new int[]{1,2,3,4,5,6,7,8,9,10};
        // int[] numArr = new int[] { 3, 1 };
        int[] numArr = new int[] { 1, 2, 3 };
        MedianOfStream medianOfStream = new MedianOfStream();

        for (int num : numArr)
        {
            medianOfStream.add(num);
        }

        double result = medianOfStream.findMedian();
        System.out.println(result);
    }
}
