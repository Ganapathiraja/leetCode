package linkedlist;

import tree.ListNode;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle
{
    public static void main(String[] args)
    {

        //Floyd's Cycle Detection Algorithm

        // 1->2->3->2 so cycle because again it points to 2

        //

        ListNode listNode = ListNode.getCycleListNode();

        // fist using hashMap solution to solve this problem

        System.out.println(detectCycleUsingHashMap(listNode));

        // one more is to use the slow , fast pointer

        System.out.println(detectCycleUsingPointer(listNode));


        // basically you have to find the fist element that made this cycle
        System.out.println( detectFistNodeCycleInNode(listNode));

    }

    private static ListNode detectFistNodeCycleInNode(ListNode head)
    {
        ListNode meet = detectCycleUsingPointerReturnNode(head);
        ListNode current = head;

        while (current != meet)
        {
            meet = meet.next;
            current = current.next;
        }
        System.out.println("Cycle started with :: {} "+current.data);
        return current;
    }

    private static boolean detectCycleUsingPointer(ListNode listNode)
    {

        ListNode slow = listNode;
        ListNode fast = listNode;

        while (slow != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    private static boolean detectCycleUsingHashMap(ListNode listNode)
    {
        Set<ListNode> set =  new HashSet<>();

        while (listNode != null)
        {
            if (set.contains(listNode))
            {
                return true;
            }
            set.add(listNode);
            listNode = listNode.next;
        }
        return false;
    }

    private static ListNode detectCycleUsingPointerReturnNode(ListNode listNode)
    {

        ListNode slow = listNode;
        ListNode fast = listNode;

        while (slow != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return slow;
            }
        }
        return null;
    }
}
