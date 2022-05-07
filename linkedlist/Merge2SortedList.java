package linkedlist;

import tree.Node;

public class Merge2SortedList
{
    public static void main(String[] args)
    {

        // the goal is to merge the 2 sorted LinkedList

        // list1 ==> 5->7->9
        // list2 ==> 3->4->8->10
        // mergeList ==> 3->4->5->7->8->9->10

        /*
        let us assume we are given 2 LinkedList
         */
        Node node1 = null;
        Node node2 = null;
        solveSolution(node1,node2);

    }

    private static  Node solveSolution(Node node1, Node node2)
    {
        if (node1 == null) return node2;

        if (node2 == null) return node1;

        // this is just to swap the node and still make node2 be the largest for simplicity
        if (node1.data > node2.data)
        {
            Node temp = node1;
            node1 = node2;
            node2 = temp;
        }

        Node result = node1;

        while (result != null && node2 != null)
        {
            Node temp = null;
            while (node1 != null && node1.data <= node2.data)
            {
                temp = node1;
                node1 = node1.next;
            }
            temp.next = node2;

            //swap
            Node swapNode = node1;
            node1 = node2;
            node2 = swapNode;
        }
        return result;
    }
}
