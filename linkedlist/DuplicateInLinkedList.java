package linkedlist;

import tree.ListNode;

public class DuplicateInLinkedList
{
    public static void main(String[] args)
    {


        ListNode listNode = new ListNode(10);
        listNode.next = new ListNode(20);
        listNode.next.next = new ListNode(30);
        listNode.next.next.next = new ListNode(10);

        System.out.println(solveSolution(listNode));
    }

    private static int solveSolution(ListNode head)
    {
        int count = 0;

        while (head.next != null)
        {

            // Starting from the next node
            ListNode ptr = head.next;
            while (ptr != null)
            {
                // If some duplicate node is found
                if (head.data == ptr.data)
                {
                    count++;
                    break;
                }
                ptr = ptr.next;
            }

            head = head.next;
        }

        // Return the count of duplicate nodes
        return count;
    }
}
