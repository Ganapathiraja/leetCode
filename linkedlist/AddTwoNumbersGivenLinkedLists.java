package linkedlist;

import tree.Node;
import tree.Node;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbersGivenLinkedLists
{
    public static void main(String[] args)
    {


        Node list1 = null;
        Node list2 = null;

        Node dummy = new Node(0);
        Node temp = dummy;

        int carry = 0;
        while (list1 != null || list2 != null || carry ==1)
        {
            int sum = 0;

            if (list1 != null)
            {
                sum += list1.data;
                list1 = list1.next;
            }

            if (list2 != null)
            {
                sum += list2.data;
                list2 = list2.next;
            }

            sum += carry;
            carry = sum/10;
            Node Node = new Node(sum %10);
            temp.next = Node;
            temp = temp.next;

        }
        // return dummy.next;

    }
}
