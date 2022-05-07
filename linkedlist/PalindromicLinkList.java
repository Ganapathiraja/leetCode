package linkedlist;

import tree.ListNode;

public class PalindromicLinkList
{
    public static void main(String[] args)
    {

        // if the given link list is palindromic or not

        // find the middle of the link list and then from there try to move the node to next and
        // keep the dummy node at the start now just keep moving both to the end point he list for the middle
        //list node and find the answ



        // what can be done is to the StringBuilder to add the numbers
        // then use the add it to them and then just reverse and check

        //https://leetcode.com/problems/palindrome-linked-list/discuss/1906593/O(n)-time-and-O(1)-space-with-explanation-easy-to-understand

        ListNode listNode = new ListNode(10);
        listNode.next = new ListNode(20);
        listNode.next.next = new ListNode(30);
        listNode.next.next.next = new ListNode(20);
        listNode.next.next.next.next = new ListNode(100);

        // if the data is palindrome then it will return TRUE or else FALSE
        System.out.println(solveSolution(listNode));
    }

    private static boolean solveSolution(ListNode listNode)
    {
        //intuition is to fist find the middle element
        // then from the middles next element try to reverse the entire linkedList
        // then loop and compare the list

        ListNode middleElement = findMiddleElementOfListNode(listNode);
        System.out.println(middleElement.data);
        ListNode reverseList = reverseListNode(middleElement.next);
        ListNode current = listNode;

        while (reverseList != null)
        {
            if (reverseList.data != current.data)
            {
                return false;
            }
            reverseList = reverseList.next;
            current = current.next;
        }

        return true;
    }

    private static ListNode reverseListNode(ListNode head)
    {

        ListNode current = head;
        ListNode prev = null;
        ListNode next;

        while (current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }

    private static ListNode findMiddleElementOfListNode(ListNode listNode)
    {
        ListNode slow = listNode;
        ListNode fast = listNode;

        while (slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
