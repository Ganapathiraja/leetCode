package linkedlist;

import tree.Node;

public class MiddleOfLinkList
{
    public static void main(String[] args)
    {

        // naive approach is to iterate the list and then have a counter for the count then divide by 2 and then again
        // the loop and when reached to the counter then return the number

        // optimum is to have slow and fast pointer

        Node node = Node.addNode();

        Node slow = node,fast=node;

        while ( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // return slow; // return the slow node
        // so return slow pointer as this will be pointing to the middle of the list in the node
    }
}
