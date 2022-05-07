package linkedlist;

import sun.tools.tree.ShortExpression;
import tree.Node;

public class Main
{
    public static void main(String[] args)
    {

      Node head = Node.addNode();

/*
       while (head != null){
           System.out.print(head.data+"\t");
           head = head.next;
       }
*/


       Node dummyNode = null;

       while (head != null){
           Node next = head.next;
           head.next = dummyNode;
           dummyNode = head;
           head = next;
       }

        // the nodes are reversed
       Node node = dummyNode;

        while (node != null){
            System.out.print(node.data+"\t");
            node = node.next;
        }

    }
}
