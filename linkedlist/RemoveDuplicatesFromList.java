package linkedlist;

import tree.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromList
{

    public static void main(String[] args)
    {

        ListNode start = ListNode.getListNode();

        System.out.println(
            "Linked list before removing duplicates :");
        System.out.println(start);

        removeDuplicate(start);

        while (start!=null)
        {
            System.out.print(start.data+" \t");
            start =start.next;
        }
        
    }

    private static void removeDuplicate(ListNode head)
    {

        Set<Integer> set = new HashSet<>();

        ListNode current = head;
        ListNode prev = null;

        while (current!= null)
        {
            int val = current.data;
            if (set.contains(val))
            {
                prev.next = current.next;
            }else {
                set.add(val);
                prev = current;
            }
            current = current.next;
        }

        System.out.println(head);

    }
}
